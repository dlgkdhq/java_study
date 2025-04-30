package study.practice.practice29;

public class Monitor {
	
	//속성 
	//( 제조회사, 인치, 가격, 색상, 최대해상도x, 최대해상도y ) -> 필드변수 생성
	
	String company;
	int inch;
	int price;
	String color;
	int resolutionX;
	int resolutionY;
	
	//생성자
	Monitor(String company, int inch, int price){
		this.company = company;
		this.inch = inch;
		this.price = price;
	}
	
	//메소드
	void setXY(int resolutionX, int resolutionY) {
		 this.resolutionX = resolutionX;
		 this.resolutionY = resolutionY;
	}
	
	void setColor(String color) {	
		this.color = color;
		//입력 -> 수행할 코드 -> 출력
		//매개변수 -> 코드 -> return
	}
	
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	int priceUp(int x) {	//매개변수로 증가할 금액을 입력받음
		//금액인상 실행 코드
		this.price = this.price + x;
		
		//출력/반환/return 인상된 금액
		return this.price;
		
	}
	
	void printInfo() {
		System.out.printf("%s %d인치 가격:%d원 색상:%s 해상도:%d * %d\n", 
						company, inch, price, color,resolutionX, resolutionY );
	}
}
