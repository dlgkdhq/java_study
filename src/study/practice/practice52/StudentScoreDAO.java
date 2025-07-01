package study.practice.practice52;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;
import study.db.v4.StudentDTO;

public class StudentScoreDAO {
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	public List<StudentScoreDTO> findStudentScoreListBydeptno(int deptno) {
		conn = DBConnectionManager.connectDB();
		
		String query = " select st.studno, st.name, sc.total, hj.grade "
				+ " from student st, score sc, hakjum hj "
				+ " where st.studno = sc.studno "
				+ " and sc.total between hj.min_point and hj.max_point "
				+ " and st.deptno1 = ? ";

		List<StudentScoreDTO> sList = new ArrayList<StudentScoreDTO>();

		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체

			psmt.setInt(1, deptno);
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			while (rs.next()) {
				
				StudentScoreDTO s = new StudentScoreDTO();

				s.setStudno(rs.getInt("studno"));
				s.setName(rs.getString("name"));
				s.setTotal(rs.getInt("total"));
				s.setGrade(rs.getString("grade"));
				
				sList.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBConnectionManager.disconnectDB(conn, psmt, rs);

		return sList;
	}
}
