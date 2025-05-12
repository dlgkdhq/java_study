package study.practice.practice41;

public class Refrigerator {
	/*
		냉장고
		- 어느 브랜드인지
		- 몇리터 짜리인지
		- 전원을 켤수 있다
		- 온도조절을할수있다(온도 up 또는 온도 down)
		- 문이 몇개인지
	 */

	String brand;
	int liter;
	int doorsNumber;
	boolean isPowerOn;	//전원이 켜져있나?
	int temperature;	//현재 온도
	
	int maxTemperature; //냉장고 설정가능한 최고 온도
	int minTemperature; //냉장고 설정가능한 최저 온도
	
	IceTray iceTray; // =new IceTray();	 냉장고 안에 얼음트레이가 있구나.. 부품필드로 사용 가능
	
	public void powerOn() {
		System.out.println(isPowerOn ? "냉장고 전원 켜져있음" : "냉장고 전원 꺼져있음");
	}
	
	public void temperatureUp() {
		temperature++;	//온도 1도 올리기
	}
	public void temperatureDown() {
		temperature--;	//온도 1도 내리기
	}
	public void controlTemperature(boolean isUp) {
		if(isUp) {
			temperature++;
		} else {
			temperature--;
		}
	}
	//몇 도 조절
	public void controlTemperature(int temp) {
		if(temperature + temp <= maxTemperature && temperature + temp >= minTemperature) {
			temperature += temp;
		}
	}
	//온도 세팅 - 매개변수로 들어온 온도를 바로 현재 값으로 저장
	public void setTemperature(int temp) {
		if(temp <= maxTemperature && temp >= minTemperature) 
			this.temperature = temp;
		
	}
}


class IceTray {
	/*
	 	냉동실안에 얼음 트레이
		- 몇구짜리인지
		- 얼마인지
	 */
	
	int price;
	int holesNumber;
}
