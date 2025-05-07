package study.collect;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Collection03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap : 키(중복x)와 값(중복o)으로 구성. key&value 쌍으로 작동
		
		//key	value
		
		//출석번호	이름
		//숫자	문자
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "김일");
		map1.put(2, "정이");
		map1.put(3, "이삼");
		map1.put(3, "최삼");	
		
		map1.remove(2); //key값 2번 지우기
		
		System.out.println(map1.size());
		System.out.println(map1.containsKey(3));
		System.out.println(map1.containsKey(5));
		
		System.out.println(map1.containsValue("이삼"));
		System.out.println(map1.containsValue("최사"));
		
		System.out.println(map1.get(1));
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("규칙1", "지각하지 않기");
		map2.put("규칙2", "결석하지 않기");
		
		System.out.println(map2.get("규칙2")); // "규칙2"에 있는 value를 불러옴
		
		System.out.println("-------map1 key-------");
		for(int key : map1.keySet()) { // key : 1 2 3 -> map1.get(1) = "김일" , ...
			System.out.print(key + " " + map1.get(key) + " ");
		}
		System.out.println();
		
		System.out.println("------map1 value------");
		for(String value : map1.values()) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		Set<Entry<Integer, String>> entrySet = map1.entrySet();
		
		System.out.println("----map1 entrySet----");
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
