package study.db.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v2.Dept;

public class DeptDAO {
	//DAO
	//Data Access Object 데이터에 접근하는 객체
	
	/* 필드변수에 사용하면 기본값이 null로 세팅되어서 = null 안해도 됨 */
	Connection conn; //DB 연결 객체
	PreparedStatement psmt; //DB연결 후, sql 명령 실행해주는 객체
	ResultSet rs; //sql Select 실행 후 조회 결과가 저장되는 객체
			
	public Dept findDeptByDeptno(int deptno) {	

		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		//String query = "select * from dept where deptno = ? ";
		String query = "select * from new_dept where deptno = ? ";
		
		Dept dept = null;	//select 할 때 리턴용

		try {

			psmt = conn.prepareStatement(query);

			//파라미터 세팅
			psmt.setInt(1, deptno);  

			rs = psmt.executeQuery();	

			if(rs.next()) {	

				dept = new Dept();

				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return dept;
	}

	public Dept findDeptByDname(String dname) {

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
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);

		//return null;	//내부 선언 : null이 리턴될 수 있음
		return dept;	//외부 선언
	}
	
	// findDeptAll
	public List<Dept> findDeptList() {

		conn = DBConnectionManager.connectDB();
		
		//쿼리 준비
		//변수명은 잘 지어주면 됨
		String query = "select * from dept";

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
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return deptList;

	}
	
	//insert
	public int saveDept(int deptno, String dname, String loc) {  //int ? 행의 갯수를 리턴받음
		
		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		String query = "INSERT INTO new_dept VALUES( ?, ?, ? )";

		int result = 0;		//행의 갯수가 0이면 잘못되었다는 거니까... 작동이 잘 안됐을 때 0을 리턴하게 함

		try {

			psmt = conn.prepareStatement(query);

			//파라미터 세팅
			psmt.setInt(1, deptno);
			psmt.setString(2, dname);
			psmt.setString(3, loc);
			
			//psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)	
			result = psmt.executeUpdate();	
			//psmt.executeUpdate() : insert, update, delete 사용 -> return int (적용된 행의 수)

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	//무조건 작동하는 코드니까 finally 에 써줘도 됨
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return result;

	}
	
	//insert
	public int saveDept(Dept dept) {  //매개변수로 dept 객체를 받음
		
		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		String query = "INSERT INTO new_dept VALUES( ?, ?, ? )";

		int result = 0;		//행의 갯수가 0이면 잘못되었다는 거니까... 작동이 잘 안됐을 때 0을 리턴하게 함

		try {

			psmt = conn.prepareStatement(query);

			//파라미터 세팅
			psmt.setInt(1, dept.getDeptno());
			psmt.setString(2, dept.getDname());
			psmt.setString(3, dept.getLoc());
			
			//psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)	
			result = psmt.executeUpdate();	
			//psmt.executeUpdate() : insert, update, delete 사용 -> return int (적용된 행의 수)

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	//무조건 작동하는 코드니까 finally 에 써줘도 됨
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return result;
	}
	
	//update
	public int modifyDept(Dept dept) {
		
		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		String query = "UPDATE new_dept SET dname = ? , loc = ? WHERE deptno = ?";

		int result = 0;		//행의 갯수가 0이면 잘못되었다는 거니까... 작동이 잘 안됐을 때 0을 리턴하게 함

		try {

			psmt = conn.prepareStatement(query);

			//파라미터 세팅
			psmt.setString(1, dept.getDname());
			psmt.setString(2, dept.getLoc());
			psmt.setInt(3, dept.getDeptno());
			
			//psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)	
			result = psmt.executeUpdate();
			//psmt.executeUpdate() : insert, update, delete 사용 -> return int (적용된 행의 수)

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	//무조건 작동하는 코드니까 finally 에 써줘도 됨
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return result;
	}
	
	//delete
	public int removeDept(int deptno) {	//pk값으로 지우면 됨
		
		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		String query = "DELETE FROM new_dept WHERE deptno = ?";

		int result = 0;		//행의 갯수가 0이면 잘못되었다는 거니까... 작동이 잘 안됐을 때 0을 리턴하게 함

		try {

			psmt = conn.prepareStatement(query);

			//파라미터 세팅
			psmt.setInt(1, deptno);
			
			//psmt.executeQuery() : select 시 사용 -> return ResultSet (조회결과 데이터)	
			result = psmt.executeUpdate();	
			//psmt.executeUpdate() : insert, update, delete 사용 -> return int (적용된 행의 수)

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {	//무조건 작동하는 코드니까 finally 에 써줘도 됨
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return result;
	}
	
	public int removeDept(Dept dept) {	//객체로도 사용 가능
		int deptno = dept.getDeptno();
		return removeDept(deptno);	//위의 코드를 활용하여 객체로 사용함
	}
	
}
