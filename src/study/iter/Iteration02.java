package study.iter;

public class Iteration02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문 while
		
		/*
		
		while(조건식 {
			실행문
		}
		
		 */
		
		//i : 1 2 3 4 5 
		for(int i=1; i<=5; i++) {
			System.out.println("피곤핑");
		}
		
		int i=1;  	  //초기화
		while(i<=5) {//조건식
			//i :1 2 3 4 5 
			System.out.println("집보내주세요!");  //실행문
			
			i++; //증감식
		}
		
		System.out.println("========");
		
		//i는 6인 상태
		//1~5를 출력해보자
		i = 1; 	//초기화
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		
		i = 0;
		while(i<5) {
			i++;
			System.out.println(i);
			
		}
		//i가 5인 상태에서 끝남. 순서에 따라 결과가 달라진다.
		
		
		//do while
		
		i = 6;
		while(i<5);{
			System.out.println("i<5");
		}
		
		do {
			System.out.println("i<5");
		} while(i<5);	//do while은 while 뒤에 ; 필요함
		
	}

}
