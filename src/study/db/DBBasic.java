package study.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBBasic {

	public static void main(String[] args) {

		findProduct();

		//selectProduct();
		//select -> find   쿼리문 명령어 이슈
		//insert -> save
		//update -> update / modify
		//delete -> delete / remove

		findDept();

	}	

	public static void findProduct() {

		//OracleDB 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		//DB연결 및 사용 시 필요한 객체
		Connection conn = null; //DB 연결 객체
		PreparedStatement psmt = null; //DB연결 후, sql 명령 실행해주는 객체
		ResultSet rs = null; //sql Select 실행 후 조회 결과가 저장되는 객체

		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//쿼리 준비
		//변수명은 잘 지어주면 됨
		String query = "select * from product";

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
				System.out.println(rs.getInt("p_code"));
				System.out.println(rs.getString("p_name"));
				System.out.println(rs.getInt("p_price"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//DB연결 종료

		try {

			if(rs != null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void findDept() {

		//OracleDB 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//DB연결정보
		String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String db_id = "scott";
		String db_pw = "tiger";

		//DB연결 및 사용 시 필요한 객체
		Connection conn = null; //DB 연결 객체
		PreparedStatement psmt = null; //DB연결 후, sql 명령 실행해주는 객체
		ResultSet rs = null; //sql Select 실행 후 조회 결과가 저장되는 객체

		//DB 연결
		try {
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

		//DB연결 종료

		try {

			if(rs != null)
				rs.close();
			if(psmt != null)
				psmt.close();
			if(conn != null)
				conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}






