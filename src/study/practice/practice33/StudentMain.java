package study.practice.practice33;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		
		s1.setMajor("수학과");
		s1.setStudentId(201901048);

		System.out.println("학과:"+s1.getMajor());
		System.out.println("학번:"+s1.getStudentId());
	}

}
