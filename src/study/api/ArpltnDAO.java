package study.api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import study.db.v2.DBConnectionManager;

public class ArpltnDAO {
	
	/*
	 CREATE TABLE MINU_DUST_WEEK 
	 (
	 	id number primary key, //pk용
	 	total_count NUMBER,
	 	frcst_one_cn varchar2(4000),
	 	frcst_two_cn varchar2(4000),
	 	frcst_one_dt varchar2(10),
	 	frcst_two_dt varchar2(10),
	 	presnatnDT varchar2(10)
	 );
	 */
	
	Connection conn; //DB 연결 객체
	PreparedStatement psmt; //DB연결 후, sql 명령 실행해주는 객체
	ResultSet rs;
	
	//insert
	public int saveMinuDustWeek(MinuDustWeekDTO mdwDTO) {
		
		conn = DBConnectionManager.connectDB();

		//쿼리 준비
		String query = "INSERT INTO MINU_DUST_WEEK "
				+ " VALUES(seq_minu_dust_week_pk.nextval, ?, ?, ?, ?, ?, ?)";

		int result = 0;	

		try {

			psmt = conn.prepareStatement(query);

			//파라미터 세팅
			psmt.setInt(1, mdwDTO.getTotalCount());
			psmt.setString(2, mdwDTO.getFrcstOneCn());
			psmt.setString(3, mdwDTO.getFrcstTwoCn());
			psmt.setString(4, mdwDTO.getFrcstOneDt());
			psmt.setString(5, mdwDTO.getFrcstTwoDt());
			psmt.setString(6, mdwDTO.getPresnatnDt());
			
			result = psmt.executeUpdate();	

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionManager.disconnectDB(conn, psmt, rs);
		}
		
		return result;
	}
}
