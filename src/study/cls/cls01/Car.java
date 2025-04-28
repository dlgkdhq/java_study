package study.cls.cls01;

public class Car {
	
	//필드(속성)
	String model;
	String color;
	int price;
	
	//기본 생성자
	//생성자를 작성하지 않아도 자동으로 만들어지는 생성자
//	Car() {
//		
//	}
	Car() {
		System.out.println("Car() 생성자 호출됨");
		color = "회색";
	}
	
	//매개변수가 존재하는 생성자
	Car(String c) {
		System.out.println("Car(String c) 생성자 호출됨");
		color = c;
	}
	
	//String c = "파랑",  int p = 1000000
	Car(String c, int p){
		System.out.println("Car(String c, int p) 생성자 호출됨");
		color = c;
		price = p;
	}
	
//	Car(String m, int p){	//타입이 String , int. 겹쳐서 안됨.
							//순서라도 바꾸면 ㄱㅊ
//	Car(int p, String m) {	//가능	
//	Car(String m, String c, int p) {
//		System.out.println("Car(String c, int p) 생성자 호출됨");
//		model = m;
//		color = c;
//		price = p;
//	}
	
	
	//만약 String company; 가 있다면? String c는 color? company?
	//를 방지하기 위해 이름을 다 적어줌
	Car(String model, String color, int price) {
		System.out.println("Car(String c, int p) 생성자 호출됨");
		this.model = model;	//this.model : 필드 = model : 매개변수
		this.color = color;
		this.price = price;
	}
	
	/* 
	 * 언더바를 사용할 수도 있음!
	Car(String _model, String _color, int _price) {
		System.out.println("Car(String c, int p) 생성자 호출됨");
		model = _model;	//model : 필드 = _model : 매개변수
		color = _color;
		price = _price;
	}
	*/

}
