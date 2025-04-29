package study.practice.practice27;

public class Person {
	/*	 
		사람 클래스
		
		이름
		성별
		나이
		키
		몸무게
		직업
		혈액형
		건강상태
		수면중여부
	 */
	
	//필드(속성)
	String name;
	String gender;
	int age;
	double height;
	double weight;
	String job;
	String bloodtype;
	//String healty;
	boolean isHealthy;
	boolean isSleeping;
	
	//생성자 : 객체가 생성될 때 초기에 해야할 일
	Person(){	//기본생성자
		
	}
	
	Person(String name, String gender, int age, double height, double weight, String job, 
			String bloodtype,boolean isHealthy,boolean isSleeping) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.bloodtype = bloodtype;
		this.isHealthy = isHealthy;
		this.isSleeping = isSleeping;
	}
	
	//메소드  --> 필드 변수 이용 
	void printPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : "+ weight);
		System.out.println("직업 : "+ job);
		System.out.println("혈액형 : " + bloodtype);
		System.out.println("건강상태 : " + isHealthy);
		System.out.println("수면중여부 : " + isSleeping);
		System.out.println("수면중여부 : " + (isSleeping ? "자는중" : "안자는중"));
		System.out.println();
	}
}
