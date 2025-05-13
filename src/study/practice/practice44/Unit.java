package study.practice.practice44;

public abstract class Unit {
	
	int x, y; // 현재 위치
	
	abstract void move(int x, int y); //지정된 위치로 이동
	
	void stop() { 
		System.out.printf("x:%d y:%d 위치에 멈춘다", x, y);
	} //현재 위치에 정지
}
