package study.practice.practice28;

public class Monitor {
	
//	*속성
//	인치수(int타입)
//	제조사(String타입)
//	모델명(String타입)
	
	int inch;
	String make;
	String modelName;
	
//	*생성자
//	매개변수로 3개를 모두 받아서 저장하는 생성자
	Monitor() {
		
	}
	
	Monitor(String make, String modelName,int inch) {
		this.inch = inch;
		this.make = make;
		this.modelName = modelName;
	}
	
//	*메소드
//	가지고 있는 3개의 정보를 출력하는 printInfo 메소드 생성
	
	void printInfo() {
		System.out.println("제조사:" + make +" "+ "모델명:"+modelName+" "+"인치:"+inch+"인치");
	}
}
