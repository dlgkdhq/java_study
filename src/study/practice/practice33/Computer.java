package study.practice.practice33;

public class Computer {

	int memory;	//메인메모리
	int i; //배열 인덱스 0 1 2 ..
//	String os; //os 이름
	
	//public final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
	public static final String[] OS_TYPE = {"윈도우10", "애플 OS X", "안드로이드"}; //변하지 않는다면 정적변수로 사용 가능
	
	Computer(int i, int memory){
		this.i = i;
		this.memory = memory;
		
//		this.os = osType[i]; 
	}
	
	void print() {
//		System.out.printf("운영체제: %s, 메인메모리: %d\n", osType[i], memory);
//		System.out.printf("운영체제: %s, 메인메모리: %d\n", os, memory);
		System.out.printf("운영체제: %s, 메인메모리: %d\n", OS_TYPE[i], memory);
	}
	
}
