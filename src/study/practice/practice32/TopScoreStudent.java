package study.practice.practice32;

public class TopScoreStudent {

	public static void main(String[] args) {
		// 배열 생성
		String[] names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
		int[] scores = {65, 74, 23, 75, 68, 96, 88, 98, 54};

		// 1등 인덱스 검색
		int i = topIndex(scores);

		// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
	}

	// 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	public static int topIndex(int[] arr) {
		/* 해당 함수를 완성하세요. */
		
		int maxIndex = 0;
		for(int i=0; i<arr.length; i++ ) {
			if( arr[maxIndex] < arr[i] ) {	
				maxIndex = i;
			}
		}
		return maxIndex;
		
//===================================================================
		
//		//max값을 알면 arr[i] == max -> i: maxIndex
//		int max = arr[0];
//		int maxIndex = 0;
//		for(int i=0; i<arr.length; i++ ) {	//true 더 큰값 찾음
//			if(arr[i] > max) {	
//				max = arr[i];
//				maxIndex = i;
//			}
//		}
//		return maxIndex;
		
	}
}

