package study.collect;

import java.util.ArrayList;

public class Collection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList
		
		String[] arr = new String[3];
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//향상된 for문
		for(String value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		//string이 들어있는 배열 리스트 생성, 값은 안들어있음. 공간만 선언한 상태
		ArrayList<String> list = new ArrayList<String>();
		
		ArrayList<String> list2 = null;
		//ArrayList<Menu>	Menu[]
		//ArrayList<Order>	Order[]
		
		System.out.println(list.size()); 	//리스트 크기
		//System.out.println(list2.size());
		
		list.add("D");	//리스트에 값을 유동적으로 추가 가능
		list.add("E");
		list.add("F");
		list.add("G");
		
		System.out.println(list.size()); 
		System.out.println(list.get(2));	//특정 위치의 값 출력
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		list.add(2, "A");	//추가할 인덱스 위치, 추가할 값 (2인덱스 이후부터는 뒤로 밀림)
		list.set(3, "H");	//바꿀 인덱스 위치, 바꿀 값 (해당 위치 값이 바뀜)
		list.remove(0);		//해당 인덱스 위치 값 삭제 -> 값은 몰라도 위치를 알면 사용가능
		list.remove("G");	//해당 값 삭제 -> 위치는 몰라도 값을 알면 사용가능
		
		for(String v : list) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		System.out.println(list.contains("Z")); //그 값을 가지고 있는가? -> contains는 boolean 타입
		System.out.println(list.contains("E"));
		
		
		int[] intArr = new int[10];
		
		//ArrayList<int> intList = new ArrayList<int>(); //참조변수라서 기본변수(int, double 등)는 안먹힘!
		ArrayList<Integer> intList = new ArrayList<Integer>(); //int를 감싸주는 역할
		
		//포장객체 Wrapper Class
		//int -> Integer
		//double -> Double
		//boolean -> Boolean
		
		intList.add(10);
		//intList.add(new Integer(30));
		intList.add(30);
		intList.add(50);
		
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		for(int n : intList) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
