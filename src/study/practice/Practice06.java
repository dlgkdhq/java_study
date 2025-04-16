package study.practice;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		
			System.out.print("삼각형 밑변 : ");
			int bottom = scanner.nextInt();
			System.out.print("삼각형 높이 : ");
			int height = scanner.nextInt();
			double triangle = (double) bottom * height / 2;
			System.out.printf("삼각형 넓이 = %.2f\n", triangle);

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;
			
			System.out.print("사다리꼴 윗변 : ");
			int topLine = scanner.nextInt();
			System.out.print("사다리꼴 밑변 : ");
			int bottomLine = scanner.nextInt();
			System.out.print("사다리꼴 높이 : ");
			int height1 = scanner.nextInt();
			double area = (double)(topLine + bottomLine) * height1 / 2;
			System.out.printf("사다리꼴 넓이 = %.2f\n", area);
		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
		
			int friend = 24;
			int snack = 100;
			System.out.println("한명 당 받는 과자 수 : " + snack/friend);
			System.out.println("남는 과자 수 : " +snack%friend);

		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8
		
			System.out.print("세 자리의 정수 : ");
			int num = scanner.nextInt();
			int a = num / 100; 			  
			int b = (num - 100*a) / 10;	  //num/10%10
			int c = num - (100*a+10*b);   //num%10;
	
			System.out.printf("백의 자리 : %d\n", a);
			System.out.printf("십의 자리 : %d\n", b);
			System.out.printf("일의 자리 : %d\n", c);

		
		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
			int x = 10;
			int y = 20;
			System.out.println("x="+x+ " y="+y);
		// x와 y를 바꾼 작업
			int z=x;
			x=y;
			y=z;
			System.out.println("x="+x+ " y="+y);
	}

}
