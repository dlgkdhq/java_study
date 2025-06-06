package study.var;

public class Variable03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수 타입변환
		
		double d1 = 3.14;
		double d2 = d1;  //double <- double
		
		int i1 = 30;
		int i2 = i1;  //int <- int
		
		// int i3 = 3.33;  // int 정수형 <- 실수형 3.33 저장불가xxx
		
		double d3 = i1; //double <- int 자동타입변환. 큰타입 = 작은타입
		
		int i3 = (int)d2;  //작은타입 = (작은타입)큰타입 강제타입변환.
		
		System.out.println(d2);	 //3.14
		System.out.println(i3);  //3.   강제타입변환 시 소수점 0.14 손실
		
		//java 정수 -> int 타입 인식
		//java 실수 -> double 타입 인식
		
		//float f1 = 5.5;			// float 타입 = double 타입 -> 강제타입변환, double값 + f
		float f1 = 5.5f;
		d3 = f1; 		//double = float 자동타입변환
		
		double d4 = 15;			// double 타입 = int 값   15->15.0 자동타입변환
		double d5 = 15.5;
		System.out.println(d4);
		
		
		int i6 = 10;
		double d6 = 5.5;
		
		double result1 = i6 + d6; 		//int + double -> double
		System.out.println(result1);
		
		// int		= double
		// int result2 = i6 + d6;         //int + double
		int result2 = i6 + (int)d6;       //int + int (5.5->5)
		
		result2 = (int)(i6 + d6); 		//(int)(double)
				//    (int + double)	

		double dv1 = 5.5;
		double dv2 = 6.6;
		
		int rst = (int)dv1 + (int)dv2;
		System.out.println(rst); //11
		
		rst = (int)(dv1 + dv2);
		System.out.println(rst); //12
		
		int x = 1;
		int y = 2;
		double z = x / y;
				//int / int -> 연산결과타입 int
				// 1 / 2 -> 0
			 //z = 0.0 	double = int
		System.out.println(z);
		
		// 소수점이 정확하게 결과로 나오게 하기 위해 연산을 double과 int의 연산으로 바꾼다.
		// int 값 한개 or 두개 모두를 (double) 실수형으로 강제타입변환
		z = (double)x / y;		//double / int -> double
		z = x / (double)y;		//int / double -> double
		z = (double)x / (double)y; 	//double / double -> double 
		System.out.println(z);
		
		z = 10 / 3.0; 
		z = 10.0 / 3;
	}

}
