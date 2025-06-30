package study.practice.practice49;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import study.db.v2.DBConnectionManager;

public class Practice49 {

	public static void main(String[] args) {

		List<Professor> professorList = findProfessorListByDeptno(103);
			for(Professor p : professorList) {
				//System.out.printf("%d %s %s %s %d %d \n", p.getProfno(), p.getName(), p.getId(), p.getPosition(), p.getPay(), p.getDeptno());
				System.out.println(p.toString());
			}
		
	}

	public static List<Professor> findProfessorListByDeptno(int deptno) {	//리스트 단위

		//DB연결 및 사용 시 필요한 객체
		Connection conn = null; //DB 연결 객체
		PreparedStatement psmt = null; //DB연결 후, sql 명령 실행해주는 객체
		ResultSet rs = null; //sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();
		
		//쿼리 준비
		//변수명은 잘 지어주면 됨
		//String query = "select * from professor where deptno = ?";
		String query = "select profno, name, id, position, pay, deptno from professor where deptno = ?";

		List<Professor> professorList = new ArrayList<Professor>();

		try {

			psmt = conn.prepareStatement(query);	//쿼리 실행 준비객체

			psmt.setInt(1, deptno);
			
			rs = psmt.executeQuery();			
			
			while(rs.next()) {

				Professor professor = new Professor(rs.getInt("profno"),
													rs.getString("name"),
													rs.getString("id"),
													rs.getString("position"),
													rs.getInt("pay"),
													rs.getInt("deptno"));
				professorList.add(professor);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return professorList;

	}
}
