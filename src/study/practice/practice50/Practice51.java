package study.practice.practice50;

import java.util.List;

public class Practice51 {

	public static void main(String[] args) {

		StudentDAO studentDAO = new StudentDAO();

		StudentDTO studentDTO = new StudentDTO();

		studentDTO.setStudno(9990);
		studentDTO.setName("Charlie Chaplin");
		studentDTO.setId("CC");
		studentDTO.setGrade(3);
		studentDTO.setJumin("7902251152345");
		studentDTO.setBirthday("1979-02-25");
		studentDTO.setTel("02)123-4567");
		studentDTO.setHeight(185);
		studentDTO.setWeight(80);
		studentDTO.setDeptno1(102);
		studentDTO.setDeptno2(201);
		studentDTO.setProfno(4001);
		
		StudentDTO studentDTO2 = new StudentDTO();

		studentDTO2.setStudno(9999);
		studentDTO2.setName("name");
		studentDTO2.setId("iddd");
		studentDTO2.setGrade(5);
		studentDTO2.setJumin("7902251152345");
		studentDTO2.setBirthday("1979-02-25");
		//studentDTO2.setTel("02)123-4567"); String 변수 애들은 공백으로 두면 null값이 입력됨
		studentDTO2.setTel(null);	//직접 null 입력해도 가능
		studentDTO2.setHeight(185);
		studentDTO2.setWeight(80);
		studentDTO2.setDeptno1(102);
		studentDTO2.setDeptno2(null);
		studentDTO2.setProfno(4001);

		int result = studentDAO.saveStudent(studentDTO2);
		
		
		
		if (result > 0) {
			System.out.println("저장 성공~");

		}

	}
}
