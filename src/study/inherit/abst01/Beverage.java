package study.inherit.abst01;

//abstract class : 추상클래스. 부모역할은 하지만 실체화는 불가능
//							상속은 되지만 혼자 생성 불가
public abstract class Beverage {	//음료
	String name;
	int ml;
	
	public void intro() {
		System.out.println("저는 음료입니다");
	}
	
	//추상메소드 선언부분만
	//코드 실행부분 구현 안함 -> 실행부분은 자식클래스 안에서 구현
	public abstract void checkSafety();
	//안전검사
	
	//마시기 위해서 뚜껑을 열어야함
	public abstract void open();
	
}
