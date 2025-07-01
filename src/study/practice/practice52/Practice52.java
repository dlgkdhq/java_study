package study.practice.practice52;

import java.util.List;

public class Practice52 {

	public static void main(String[] args) {
		
		StudentScoreDAO studentDAO = new StudentScoreDAO();
		
		List<StudentScoreDTO> ssList = studentDAO.findStudentScoreListBydeptno(101);
		
		for(StudentScoreDTO ss : ssList) {
			System.out.println(ss);
		}
	}

}
