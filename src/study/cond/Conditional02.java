package study.cond;

public class Conditional02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dice = 5;
		
		if (dice == 1) { // 5==1 -> false
			System.out.println("한칸 전진");
		} 
		
		if (dice == 1) { 
			System.out.println("한칸 전진");
		} else {
			System.out.println("1이 아닐 때 할 행동1");
			System.out.println("1이 아닐 때 할 행동2");
			System.out.println("1이 아닐 때 할 행동3");
		}
		
		if (dice == 1)  
			System.out.println("한칸 전진");
		else 
			System.out.println("1이 아닐 때 할 행동1");
		
		System.out.println("1이 아닐 때 할 행동2");
		System.out.println("1이 아닐 때 할 행동3");
		
		/*
			if()
			if()
			if()
			  
			if()
			else
			  
			if()
			else if()
			else if()
			else if()
			else
			
			else나 elseif부터 시작 안됨. if 먼저 .
		 */
		
		if (dice == 1) {
		} else if (dice == 2) {
		} else if (dice == 3) {
		} 
		
		if (dice == 1) {
		} else if (dice == 2) {
		} else if (dice == 3) {
		} else {
		}
		
		if (dice == 1) {
		} 
		if (dice == 2) {
		} 
		if (dice == 3) {
		} 
		
		/*
			6000원 이하 -> "훌륭"
			6000원 초과 ~ 8000원 -> "선방"
			8000원 초과 ~ 12000원 -> "눈물"
			12000원 초과 -> "물로배채우기"
		*/
		
		int menuPrice = 12000;
		
//		//구분이 제대로 안되는 케이스 . if만 활용한 케이스
		if (menuPrice <= 6000) {
			//훌륭
		}
		if (menuPrice <= 8000) {
			//선방
		}
		
//		//구분 안되는거 구분하도록 - if만 활용한 케이스
		if (menuPrice <= 6000) {
			//훌륭
		}
		if (menuPrice > 6000 && menuPrice <= 8000) {
			//선방
		}
		if (menuPrice > 8000 && menuPrice <= 12000) {
			//눈물
		}
		
//		굿굿
		if (menuPrice <= 6000) {
			//훌륭
		} else if (menuPrice <= 8000) { // 가격 <= 6000 false 확정
			//선방
		} else if (menuPrice <= 12000) {
			//눈물
		} else { 		//else if (menuPrice <= 12000 )
			//물로배채우기
		}
		
//		//로직이 잘못된 케이스
		if (menuPrice > 6000) {
			//선방
		} else if (menuPrice > 8000) { 
			//눈물
		} else if (menuPrice > 12000) {
			//물로배채우기
		} else { 		// 가격 <= 6000
			//훌륭
		}
		
//		//잘못된 로직 그나마 결과라도 맞게 나오게
		//if 조건문 -> 중첩 사용 가능 --------------> 망한 효율..
		if (menuPrice > 6000) {
			//중첩 if
			if (menuPrice > 12000) {
				//물배
			} else if (menuPrice >8000) {
				//눈물
			} else {
				//선방
			}
			
		} else if (menuPrice > 8000) { 
			//눈물
		} else if (menuPrice > 12000) {
			//물로배채우기
		} else { 		// 가격 <= 6000
			//훌륭
		}
		
		
//		굿굿
		if (menuPrice > 12000) {
			//물로배채우기
		} else if (menuPrice > 8000) {
			//눈물
		} else if (menuPrice > 6000) {
			//선방
		} else { 		
			//훌륭
		}
		
		
	}

}
