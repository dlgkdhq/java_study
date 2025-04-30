package study.cls.cls02;

public class IPad {

	String owner; //소유자
	static String brand = "Apple";	//브랜드
	
//	IPad() {
//		this.brand = "Apple";
//	}
	
	void powerOn() {
		System.out.println("아이패드 전원 켜짐");
		System.out.println(owner + "의 아이패드");	
		
//		System.out.println(brand + "에서 만든 아이패드");
//		check();			-> 가능
	}
	
	static void check() {
		System.out.println(brand + "에서 만든 아이패드");
		//this.owner = "소유주"; 	static은 주체 기준 없이 호출 -> this 특정 주체를 나타낼 수 없다
		//System.out.println(owner + "의 아이패드"); //static에서 인스턴스 접근 못함. 태어난 시점이 다름
												 //static은 이미 태어난 애, owner는 new Owner()를 해줘야 태어남
		//System.out.println(IPad.brand + "에서 만든 아이패드");
	}
}
