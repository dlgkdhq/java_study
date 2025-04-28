package study.refer;

import java.util.Scanner;

public class Reference07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day1 = "MONDAY";
		String day2 = "FRIDAY";
		
		Scanner scanner = new Scanner(System.in);
		String today = ""; //사용자가 입력한 값
		
		if(today.equals(day1)) {
			System.out.println("출근");
		}
		
		if(today.equals(day2)) {
			System.out.println("퇴근");
		}
		
		//붕어빵 토핑 : ppat, sucream, kimchi, pizza
		String topping = "pizza"; 
		
		Week day3 = Week.MON;
		Week day4 = Week.FRI;
		
		if(day4 == Week.FRI) {
			System.out.println("금요일이다!");
		}
		
		Topping tp1 = Topping.SUCREAM;
	}

}
