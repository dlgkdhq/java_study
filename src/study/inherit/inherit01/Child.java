package study.inherit.inherit01;

public class Child extends Parent { //Parent class를 상속받음
									//Parent가 상속받고 있는 GrandParent 클래스도 상속받음

	int grade; //학년
	String school; //어디학교
	
	//생성자
	//기본생성자
	//public Child() {}
	
	//상속받으면 부모 생성자를 먼저 실행하고 자기 자신의 생성자를 실행
	//부모 클래스가 먼저 생성되고 자식 클래스가 생성되기 때문에.
	
	public Child() {
		//상속받은 부모클래스 생성자
		//super(); 부모생성자 부르는 코드 
		super(0);
		
		//자식 클래스에서 해야할 일
		//this(10, "매개변수"); //자기자신의 다른 생성자 부르는 코드
	}
	public Child(int money) {
		//부모클래스 생성자가 먼저 들어가야함.
		super(money);
		//this.money = money;
	}
	public Child(int grade, String school) {
		super(0);
		this.grade = grade;
		this.school = school;
	}
	public Child(int money, int grade, String school) {
		super(money);
		this.grade = grade;
		this.school = school;
	}
	
	public void play() {	//자식클래스만 사용가능
		System.out.println("아이들 뛰어놀기");
	}
	
	public void printInfo() {
		System.out.println(grade+"학년 "+school+"다님 돈:"+money);
		System.out.println(age + "살");
	}
	
	public void say() {	//메소드 오버라이딩 : 재정의
		System.out.println("어린이가 하는 말");
	}
	
//	public void donate() {	//Parent에서 final로 정의되었기에 재정의 불가
//		System.out.println("한 달에 10만원 기부");
//	}
}
