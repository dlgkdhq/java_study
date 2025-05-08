package study.inherit.inherit01;

public class Parent extends GrandParent{
	protected int money;	//private 이면 상속안됨, getter, setter 이용하면 가능
	//protected : 같은 패키지 + 자식까지 접근 가능한 접근 제한자
	
//	public Parent() {
//		System.out.println("Parent() 생성자");
//	}
	
	public Parent(int money) {
		this.money = money;
	}
	
	public void say() {
		System.out.println("부모님 말씀");
	}
	
	public final void donate() {
		System.out.println("한 달에 100만원 기부");
	}
	
	private void nightMeal() {
		System.out.println("야식먹기");
	}
}
