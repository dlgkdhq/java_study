package study.iter;

public class Iteration03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		
		//for(int i=1; i<=10; i++)
		
		while (i<=10) {
			System.out.println(i);
//			i++; 	
			
			if(i==5)
				break; //실행중인 반복문을 끝내기
			
			i++;	//순서의 영향을 받음
			
		}
		
		//무한루프
		int energy = 50;
		while(true) {
			System.out.println("달린다~");
			energy--;
			
			if(energy == 0)
				break;
		}
		
		for(energy=50; energy>0; energy--) {
			System.out.println("달려~");
		}
		
//		for(energy=50; true; energy--) {  //for문에서의 무한루프. 근데 무한루프는 주로 while문에서 사용
//			System.out.println("달려~");
//			
//			if(energy == 0)
//				break;
//		}
		
		/*
		반복(true) {
			멈춰야하는 사전 조건 확인 (사전 필터링)
			
			if(유통기한 남았나?)
				break;
			if(냄새 안나?)
				break;
			if(먹을게 남았나?)
				break;
			.	
			.
			.
			
			실행
		}
		 */
		
		System.out.println("================================");
		
		for(i=1; i<=10; i++) {
			
			if(i==5 || i==8)
				continue;		//해당 회차는 넘어가고 다음부터 실행됨
			
			if(i==7)
				break;
			
			System.out.println(i);
		}
		
	}

}

















