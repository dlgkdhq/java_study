package study.db.v3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v3.ProductDTO;

public class ProductDAO {
	
		Connection conn; 
		PreparedStatement psmt;
		ResultSet rs; 

	public ProductDTO findProductByPcode(int p_code) {	

		conn = DBConnectionManager.connectDB()	;

		//쿼리 준비
		String query = "select * from product where p_code = ? ";
		
		ProductDTO product = null;

		try {

			psmt = conn.prepareStatement(query);
			
			//파라미터 세팅
			psmt.setInt(1, p_code); 
			
			rs = psmt.executeQuery();

			if(rs.next()) {	

				product = new ProductDTO();
				
				product.setP_code(rs.getInt("p_code"));
				product.setP_name(rs.getString("p_name"));
				product.setP_price(rs.getInt("p_price"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return product;
	}
	
	public List<ProductDTO> findProductList() {

		conn = DBConnectionManager.connectDB()	;

		//쿼리 준비
		String query = "select * from product";
		
		List<ProductDTO> productList = new ArrayList<ProductDTO>();
		
		try {

			psmt = conn.prepareStatement(query);
			rs = psmt.executeQuery();
			
			while(rs.next()) {	
				ProductDTO product = new ProductDTO(rs.getInt("p_code"), rs.getString("p_name"), rs.getInt("p_price"));
				productList.add(product);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return productList;
		
		
	}
}
