package study.practice.practice41;

import java.util.ArrayList;

public class Kitchen {
	/*
		주방공간
		- 공간이 몇평인지
		- 벽지색상이 어떤지
		- 층고가 얼마나 되는지
	 */
	
	int pyeong;	
	String wallPaperColor;		//벽지색상
	int floorHeight;			//층고
	
	//Cup cup; 주방에 컵이 있다
	
	//주방에 여러개가 있는 쓰레기통과 컵
	ArrayList<TrashCan> trashCanList;
	ArrayList<Cup> cupList; // = new ArrayList<Cup>();
							// .add(new Cup());
	Refrigerator ref;
	GasStove gas;
	Sink sink;
}

class TrashCan {
	/*
	 	쓰레기통
		(*주방에 여러개가 있다)
		- 몇리터
		- 색상
		- 용량이 몇퍼센트나 찼는지
		- 쓰레기를 채운다
		- 쓰레기통을 연다
		- 쓰레기통을 닫는다
		- 쓰레기통을 비운다
	 */
	int liter;
	String color;
	
	int trashPercent;	//몇 퍼센트 차있나
	
	
	boolean isCoverOpened; //열려있는지
	
	public void open() {
		isCoverOpened = true;
	}
	public void close() {
		isCoverOpened = false;
	}
	//쓰레기 채우기
	public void fill(int percent) {
		trashPercent += percent;
	}
	//쓰레기 비우기
	public void empty() {
		trashPercent = 0;
	}	
	public void insertTrashLiter(int trashLiter) {
		// 쓰레기 3리터 버림
		
		//40리터짜리 쓰레기통
		
		trashPercent += (trashLiter/(double)liter) * 100;
		//				   소수점. 올림/
		//     3/40 = 
	}
	
}

class Cup {
	/*
	 	컵
		(*주방에 여러개가 있다)
		- 용량
		- 재질
		- 색상
	 */
	String color;
	int volume;
	String material;	//재질
}