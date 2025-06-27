package study.practice.practice48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Practice48 {

	public static void main(String[] args) {
		
		//1. 단일 행을 읽어서 리턴해서 출력하기
		Product product = findProductByPcode(102);
		if(product != null) {
			//System.out.println(product.getP_code() + " " + product.getP_name() + " " + product.getP_price());
			System.out.printf("%d %s %d \n", product.getP_code(), product.getP_name(), product.getP_price());
		}
		
		//2. 객체 리스트 단위로 리턴해서 출력하기
		List<Product> productList = findProductList();
		
		if(productList.size() > 0) {

			for(Product p: productList) {
				System.out.println(p.getP_code() + " " + p.getP_name() + " " + p.getP_price());
			}
		}
		
	}
	
	public static Product findProductByPcode(int p_code) {	

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
		String query = "select * from product where p_code = ? ";	//? : 입력받은 값 자리
		
		Product product = null;

		try {

			psmt = conn.prepareStatement(query);	//쿼리 실행 준비객체
			
			//파라미터 세팅
			psmt.setInt(1, p_code);  //쿼리에 있는 첫번째 물음표 위치에 deptno 를 세팅하겠다
			
			rs = psmt.executeQuery();			//쿼리 실행 후 결과 저장

			//ResultSet rs 에 담겨져 있는 쿼리 수행결과 확인
			if(rs.next()) {	//읽어올 데이터가 1개만 있는 경우 if를 쓰기도 함

				product = new Product();
				
				product.setP_code(rs.getInt("p_code"));
				product.setP_name(rs.getString("p_name"));
				product.setP_price(rs.getInt("p_price"));

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
		
		//return null;	//내부 선언 : null이 리턴될 수 있음
		return product;	//외부 선언
	}
	
	public static List<Product> findProductList() {

		//OracleDB 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
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
			e.printStackTrace();
		}

		//쿼리 준비
		String query = "select * from product";
		
		List<Product> productList = new ArrayList<Product>();
		
		try {

			psmt = conn.prepareStatement(query);	//쿼리 실행 준비객체
			rs = psmt.executeQuery();			//쿼리 실행 후 결과 저장
			
			while(rs.next()) {	
				Product product = new Product(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
				productList.add(product);
			}

		} catch (SQLException e) {
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
		return productList;
		
		
	}

}
