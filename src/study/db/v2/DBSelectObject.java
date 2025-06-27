package study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBSelectObject {

	public static void main(String[] args) {

		//findDept();
		//findDeptSingle();

		Dept dept = findDeptByDeptno(10);
		if(dept == null) {
			System.out.println("조회된 데이터 없음");
		}

		if(dept != null) {
			System.out.println(dept.getDeptno() + " " + dept.getDname() + " " + dept.getLoc());
		}

//		findDeptByDeptno(20);
//		findDeptByDeptno(30);
//		findDeptByDeptno(40);

		System.out.println("********findDeptList() 영역********");
		List<Dept> deptList = findDeptList();
		if(deptList == null)
			System.out.println("리스트가 없다 = 데이터가 없다");

		if(deptList.size() == 0) {
			System.out.println("리스트가 비어있다");
		}

		if(deptList != null) {

			for(Dept d: deptList) {
				System.out.println(d.getDeptno() + " " + d.getDname() + " " + d.getLoc());
			}

//			for(int i=0; i<deptList.size(); i++) {
//				Dept d = deptList.get(i);
//			}
		}

		System.out.println("********findDeptByDname() 영역********");
		Dept dept2 = findDeptByDname("RESEARCH");		
		if(dept2 != null) {
			System.out.println(dept2.getDeptno() + " " + dept2.getDname() + " " + dept2.getLoc());
		}

		System.out.println("********findDeptListAs() 영역********");
		deptList = findDeptListAs();
		for(Dept d: deptList) {
			System.out.println(d.getDeptno() + " " + d.getDname() + " " + d.getLoc());
		}
	}


	public static void findDept() {

		//DB연결 및 사용 시 필요한 객체
		Connection conn = null; //DB 연결 객체
		PreparedStatement psmt = null; //DB연결 후, sql 명령 실행해주는 객체
		ResultSet rs = null; //sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		//변수명은 잘 지어주면 됨
		String query = "select * from dept";

		try {

			psmt = conn.prepareStatement(query);	//쿼리 실행 준비객체
			rs = psmt.executeQuery();			//쿼리 실행 후 결과 저장

			//ResultSet rs 에 담겨져 있는 쿼리 수행결과 확인
			while(rs.next()) {				//읽어온 데이터를 행 단위로 반복하면서 접근
				//rs.next() 는 다음 불러올 행 데이터가 있으면 true, 없으면 false

				//컬럼 인덱스 이용
				//rs.getInt(1)

				//컬럼명 이용
				//해당 행에 컬럼 단위로 데이터 접근
				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
	}

	public static void findDeptSingle() {

		//DB연결 및 사용 시 필요한 객체
		Connection conn = null; //DB 연결 객체
		PreparedStatement psmt = null; //DB연결 후, sql 명령 실행해주는 객체
		ResultSet rs = null; //sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		//변수명은 잘 지어주면 됨
		String query = "select * from dept where deptno = 30";

		try {

			psmt = conn.prepareStatement(query);	//쿼리 실행 준비객체
			rs = psmt.executeQuery();			//쿼리 실행 후 결과 저장

			//ResultSet rs 에 담겨져 있는 쿼리 수행결과 확인
			if(rs.next()) {	//읽어올 데이터가 1개만 있는 경우 if를 쓰기도 함

				System.out.println(rs.getInt("deptno"));
				System.out.println(rs.getString("dname"));
				System.out.println(rs.getString("loc"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
	}

	//public static void findDeptByDname() {	//이 컬럼명을 이용해서 찾겠다!	
	public static Dept findDeptByDeptno(int deptno) {	

		//DB연결 및 사용 시 필요한 객체
		Connection conn = null; //DB 연결 객체
		PreparedStatement psmt = null; //DB연결 후, sql 명령 실행해주는 객체
		ResultSet rs = null; //sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		//변수명은 잘 지어주면 됨
		String query = "select * from dept where deptno = ? ";	//? : 입력받은 값 자리

		Dept dept = null;

		try {

			psmt = conn.prepareStatement(query);	//쿼리 실행 준비객체

			//파라미터 세팅
			psmt.setInt(1, deptno);  //쿼리에 있는 첫번째 물음표 위치에 deptno 를 세팅하겠다

			rs = psmt.executeQuery();			//쿼리 실행 후 결과 저장

			//ResultSet rs 에 담겨져 있는 쿼리 수행결과 확인
			if(rs.next()) {	//읽어올 데이터가 1개만 있는 경우 if를 쓰기도 함

				//Dept dept = new Dept();	//내부선언x

				//dept 값이 있을 때 값 초기화 해줘야함
				dept = new Dept();

				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

				//return dept;	//여기서 리턴하면 아래 종료가 안될 수도 있음
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		//return null;	//내부 선언 : null이 리턴될 수 있음
		return dept;	//외부 선언
	}

	public static Dept findDeptByDname(String dname) {

		//DB연결 및 사용 시 필요한 객체
		Connection conn = null; //DB 연결 객체
		PreparedStatement psmt = null; //DB연결 후, sql 명령 실행해주는 객체
		ResultSet rs = null; //sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		//변수명은 잘 지어주면 됨
		String query = "select * from dept where dname = ? ";	//? : 입력받은 값 자리

		Dept dept = null;

		try {

			psmt = conn.prepareStatement(query);	//쿼리 실행 준비객체

			//파라미터 세팅
			psmt.setString(1, dname);  //쿼리에 있는 첫번째 물음표 위치에 dname 를 세팅하겠다

			rs = psmt.executeQuery();			//쿼리 실행 후 결과 저장

			//ResultSet rs 에 담겨져 있는 쿼리 수행결과 확인
			if(rs.next()) {	//읽어올 데이터가 1개만 있는 경우 if를 쓰기도 함

				//Dept dept = new Dept();	//내부선언x

				//dept 값이 있을 때 값 초기화 해줘야함
				dept = new Dept();

				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

				//return dept;	//여기서 리턴하면 아래 종료가 안될 수도 있음
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		//return null;	//내부 선언 : null이 리턴될 수 있음
		return dept;	//외부 선언
	}

	//findDeptAll
	public static List<Dept> findDeptList() {	//리스트 단위

		//DB연결 및 사용 시 필요한 객체
		Connection conn = null; //DB 연결 객체
		PreparedStatement psmt = null; //DB연결 후, sql 명령 실행해주는 객체
		ResultSet rs = null; //sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();
		
		//쿼리 준비
		//변수명은 잘 지어주면 됨
		String query = "select * from dept where 1=2";

		//List<Dept> deptList = null;
		List<Dept> deptList = new ArrayList<Dept>();

		try {

			psmt = conn.prepareStatement(query);	//쿼리 실행 준비객체
			rs = psmt.executeQuery();			//쿼리 실행 후 결과 저장


			//ResultSet rs 에 담겨져 있는 쿼리 수행결과 확인
			while(rs.next()) {				//읽어온 데이터를 행 단위로 반복하면서 접근
				//rs.next() 는 다음 불러올 행 데이터가 있으면 true, 없으면 false

				//컬럼 인덱스 이용
				//rs.getInt(1)

//				if(deptList == null)
//					deptList = new ArrayList<Dept>();

				//컬럼명 이용
				//해당 행에 컬럼 단위로 데이터 접근
				Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				deptList.add(dept);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return deptList;

	}

	public static List<Dept> findDeptListAs() {	//별칭

		//DB연결 및 사용 시 필요한 객체
		Connection conn = null; //DB 연결 객체
		PreparedStatement psmt = null; //DB연결 후, sql 명령 실행해주는 객체
		ResultSet rs = null; //sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();
		
		//쿼리 준비
		//변수명은 잘 지어주면 됨
		String query = "select deptno dpno, dname dnme from dept";

		//List<Dept> deptList = null;
		List<Dept> deptList = new ArrayList<Dept>();

		try {

			psmt = conn.prepareStatement(query);	//쿼리 실행 준비객체
			rs = psmt.executeQuery();			//쿼리 실행 후 결과 저장


			//ResultSet rs 에 담겨져 있는 쿼리 수행결과 확인
			while(rs.next()) {				//읽어온 데이터를 행 단위로 반복하면서 접근

				//Dept dept = new Dept(rs.getInt("deptno"), rs.getString("dname"), null);	//null 이나 공백""을 넣어줌
				Dept dept = new Dept(rs.getInt("dpno"), rs.getString("dnme"), null);	//별칭 지어줬을 경우 별칭으로 조회해야함
				deptList.add(dept);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return deptList;

	}

}
