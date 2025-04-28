package study.cls.cls01;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Phone p1 = new Phone();	//사용불가 why? 생성된 매개변수가 없어서
		Phone p1 = new Phone("갤럭시21");
		
		Phone p2 = new Phone("아이폰14");
		
		Phone p3 = new Phone("아이폰15", 300);
		
		Phone p4 = new Phone("갤럭시25", 250, 5000);
	}

}
