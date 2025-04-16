package study.practice;

public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 1. 아래 1), 2) 에 맞게 풀이.
		// 1) 결과가 2가 나오도록 작성하세요
			int x1 = 10;
			int y1 = 4;
			int result1 = (int)x1/y1;
			System.out.println(result1);
		
		// 2) 결과가 2.5가 나오도록 작성하세요
			int x2 = 10;
			int y2 = 4;
			double result2 = (double)x2/y2;
			System.out.println(result2);
	
//		2. 결과가 7.5가 나오도록 작성하세요
			double a1 = 3.5;
			double b1 = 4.7;
			double result3 = a1 + (int)b1;
			System.out.println(result3);

//		3. 계산결과가 12가 나오도록 작성하세요
			String a = "3.4";
			String b = "4";
			double a2 = Double.parseDouble(a);
			int b2 = Integer.parseInt(b);
			int result4 = (int)a2 * b2;
			// int result4 = (int)Double.parseDouble(a) * Integer.parseInt(b);
			System.out.println(result4);
			
//		4. 계산결과가 "1013" 이 나오도록 코드를 작성하세요.
			String a3 = "10";
			int b3 = 3;
			double c3 = 4.5;
			String result5 = a3 + (int)(b3 * c3);
			System.out.println(result5);
			
//		5. 계산결과가 "243" 이 나오도록 코드를 작성하세요.
			int a4 = 4;
			double b4 = 3.4;
			String c4 = "6.8";
			double c5 = Double.parseDouble(c4);
			int n1 = a4 * (int)c5;
			int n2 = (int)b4;
			String n3 = String.valueOf(n2);
			String result6 = n1 + n3;
			System.out.println(result6);
			
//		6. 계산 결과가 아래와 같이 나오도록 코드를 작성하세요.
		//1) 출력결과 : 7
			int x3 = 111;
			int y3 = 13;
			int result7 = x3 - y3 * 8;  // int result = x % y;
			System.out.println(result7);
			
		//2) 출력결과 : 8
			int x4 = 111;
			int y4 = 13;
			int result8 = (int)(x4 / y4);
			System.out.println(result8);
	}

}
