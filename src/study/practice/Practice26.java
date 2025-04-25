package study.practice;

import java.util.Scanner;

public class Practice26 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		//basicV1();
		//basicV2();
		//basicV3();
		level1();

//		 	엘리베이터
//
//			스마트 엘리베이터 시스템을 제작하려고 합니다.
//			해당 시스템이 적용되는 빌딩은 100층 짜리 빌딩이며, 사람들을 원하는 층으로 스마트하게 이동시켜 줍니다.
//			해당 시스템은 사람들을 원하는 층으로 스마트하게 데려다 줍니다.
//			(반복문, 조건문, 배열, 메소드를 최대한 사용하시면 됩니다. )
//			
//			- 기본 문제
//			1층에서 사람들이 탑승하며, 각자 내릴 층에 버튼을 누릅니다.
//			(2 ~ 100 이외의 수는 입력이 없을 거라고 가정)
//			엘리베이터는 100층까지 올라가는 와중에 탑승 인원을 모두 내려주고 1층으로 내려오며,
//			엘리베이터의 층수가 변경될 때마다 현재 층수를 출력합니다.
//			참고로, 엘리베이터는 10층에서 5층으로 갔다가 11층으로 가지 않습니다. (오로지 한번에 100층까지 쭉)
//			
//			+ 탑승 인원을 입력받습니다.
//			+ 탑승 인원 만큼, 사람들이 내릴 층(2층부터 100층까지)를 각각 입력 받습니다.
//			
//		 
	
	}
	public static void basicV1() {
		//v1 : 100층까지 올라갔다가 1층으로 내려간다.
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("탑승 인원은 몇명입니까? : ");
		int people = scanner.nextInt();

		int[] floorArr = new int[people];
		System.out.print("몇 층(2~100)에서 내리시나요? : ");
		for(int i=0; i<people; i++) {	
			floorArr[i] = scanner.nextInt();

			while(floorArr[i] >100 || floorArr[i] <2 ) {
				System.out.print("2~100층 중 다시 입력해주세요 : ");
				floorArr[i] = scanner.nextInt();
			}
		}

		int startFloor = 1;	//1층부터 시작
		for(startFloor=1; startFloor<=100; startFloor++) {
			int i = 0;
			if(!(floorArr[i] == startFloor)) {
				System.out.printf("%d\n", startFloor);
			}
			for(i=0; i<people; i++) {
				if(floorArr[i] == startFloor) {
					System.out.printf("%d층입니다. 문이 열립니다.\n", floorArr[i]);
				}
			}
		}

		for(startFloor=99; startFloor>=1; startFloor--) {
			if(startFloor == 1) {
				System.out.println("1층입니다.");
			} else {
				System.out.printf("%d\n", startFloor);
			}
		}

		//샌님 방법
//		 for(int i=1; i<=100; i++) {
//			 	System.out.println(i + "층");
//			 	
//			 	//내리는 층인지 확인
//			 	for(int j=0; j<floorArr.length; j++) {
//			 	if(i == floorArr[j]) {
//			 		System.out.println("**도착**");
//			 		}
//			 	}
//			 }
//		 
//		 for(int i=100; i>=1; i--) {
//			 System.out.println(i + "층");
//		 }
	}
	public static void basicV2(){
		//v2 : 최고층에 도달하면 1층으로 내려간다.
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("탑승 인원은 몇명입니까? : ");
		int people = scanner.nextInt();

		int[] floorArr = new int[people];
		System.out.print("몇 층(2~100)에서 내리시나요? : ");
		for(int i=0; i<people; i++) {	
			floorArr[i] = scanner.nextInt();
		}
		
		//입력 층 중에서 최대값 구하기
		int maxFloor = floorArr[0];
		for(int i=0; i<floorArr.length; i++) {
			if(maxFloor<floorArr[i]) {
				maxFloor = floorArr[i];
			}
			
		}
		System.out.println("===올라갑니다===");
		for(int i=1; i<=maxFloor; i++) {
			System.out.println(i + "층");
			
			//내리는 층인지 확인
		 	for(int j=0; j<floorArr.length; j++) {
		 	if(i == floorArr[j]) {
		 		System.out.println("**도착**");
		 		}
		 	}
		}
		System.out.println("===내려갑니다===");
		for(int i=maxFloor; i>=1; i--) {
			System.out.println(i + "층");
		
	}
	}
	public static void basicV3() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("탑승 인원은 몇명입니까? : ");
		int people = scanner.nextInt();

		int[] floorArr = new int[people];
		System.out.print("몇 층(2~100)에서 내리시나요? : ");
		for(int i=0; i<people; i++) {	
			floorArr[i] = scanner.nextInt();
		}
		
		//입력 층 중에서 최대값 구하기
		int maxFloor = floorArr[0];
		for(int i=0; i<floorArr.length; i++) {
			if(maxFloor<floorArr[i]) {
				maxFloor = floorArr[i];
			}
			
		}
		
//		int floor = 1; //현재 몇층
//		boolean isUp = true;	//true : 올라가는 중  /  false : 내려가는 중
//		// flag 
//		while(true) {
//			
//			System.out.println(floor + "층");
//			
//			//100층까지 다 올라갔으면 내려가는 방향으로 설정
//			if(floor>=100)
//				isUp = false;
//
//			if(floor<=1 && isUp == false)
//				break;
//			
//			//isUp 값에 의해 +1 -1 결정
//			if(isUp)
//				floor++;
//			else
//				floor--;
			
			
//			if(floor<=0)
//				break;
			
		int floor = 1; //현재 몇층
		int flow = 1;	//flow : 1씩 증가.    -1 : 1층씩 감소  /층의 진행 방향을 의마, 층 값 변화 연산에 참여
		// flag 
		while(true) {
			
			System.out.println(floor + "층");
			
			if(floor == 1) {
			for(int j=0; j<floorArr.length; j++) {
			 	if(floor == floorArr[j]) {
			 		System.out.println("**도착**");
			 		}
			 	}
			}
			
			//if(floor>=100)
			if(floor>=maxFloor)
				flow = -1;

			if(floor<=1 && flow == -1)
				break;
			
			//isUp 값에 의해 +1 -1 결정
			floor += flow;
			
//			if(floor<=0)
//				break;
			
		}
	}

}


