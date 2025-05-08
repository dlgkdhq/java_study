package study.practice.practice37;

import java.util.HashMap;
import java.util.HashSet;

public class Practice37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 String str = "Returns a completion of the value and message";

			1. 이 문장에 사용된 알파벳의 갯수는 몇개인가요?
			(중복된 수 제외, 대소문자 구분X)
			Ex) R r 둘다 구분하지 않고 알파벳 r 한개라고 체크
			
			2. 이 문장에 사용된 알파벳들이 각각 몇 글자씩 있는지 세어보고 출력하세요.

		 */
		
		String str = "Returns a completion of the value and message";
		
		System.out.println(str.charAt(0));	//0인덱스 위치의 문자를 출력
		System.out.println(str.toLowerCase()); //원본데이터는 안바뀜
		System.out.println(str);
		
		
		str = str.toLowerCase();	//str 문자열의 모든 문자를 소문자로 바꿈. 원본데이터 바뀜
		System.out.println(str);

		for(int i=0; i<str.length(); i++) {
			//str.charAt(i) -> char 타입 == ' '
			//char -> String  .equals
			if(str.charAt(i) != ' ') //공백 제거
				System.out.println(str.charAt(i));
			
		}
		System.out.println(str.replace('r', '$')); //앞 문자를 뒤 문자로 바꿈
		System.out.println(str.replace(" ", ""));
		System.out.println(str);
		
		str = str.toLowerCase();	//소문자로
		str = str.replace(" ", "");	//공백 제거, 원본데이터 바뀜
		
		System.out.println("문자열 자체의 길이 : " + str.length());
	
//		System.out.println(str);
//		for(int i=0; i<str.length(); i++) {
//			System.out.println(str.charAt(i));
//		}
		
		HashSet<Character> set = new HashSet<Character>(); 
		for(int i=0; i<str.length(); i++) {
			set.add(str.charAt(i));
		}
		System.out.println("알파벳 종류의 수 : " + set.size());
		
		//2.
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
//			if(map.containsKey(c)) {
//				map.put(c, map.get(c)+1);
//			} else {
//				map.put(c, 1);
//			}

			map.put(c, map.getOrDefault(c, 0) + 1);	//위 코드를 이렇게 나타낼 수 있음. 
			
		}
		for(char key : map.keySet()) {
			System.out.println("알파벳:" + key + "갯수:" + map.get(key));
		}
	}

}
