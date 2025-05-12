package study.practice.practice41;

public class GasStove {
	/*
		가스렌지
		- 화구가 몇인지
		- 어디 브랜드인지
		- 가격이 얼마인지
		- 불을 켠다
		- 불을 끈다
		- 불세기를 조절한다.
	 */
	
	int fireBallNumber;	//화구 개수
	String brand;
	int price;
	
	int fireLevel; //현재 불 세기 단계(0~10)
	
	public void fireOn() {
		fireLevel = 5;
	}
	public void fireOff() {
		fireLevel = 0;
	}
	public void controlFirePower(int fireLevel) {
		//if(불 최소 단계 > fireLevel 불 최대 단계 < fireLevel)
		this.fireLevel = fireLevel;
	}
}
