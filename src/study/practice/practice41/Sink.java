package study.practice.practice41;

public class Sink {
	int width;
	int height;
	int depth;
	String color;
	String material; //재질
	
	public int getWidth() {	//기본 getter 
		return width;	//그상태그대로 mm 단위
	}
	
	public int getWidthAsCm() { //width cm 단위로 반환하는 메소드(getter)
		return width/10;
	}
	
	public double getWidthAsMeter() { //width m 단위로 리턴
		return width/1000.0;
	}
}
