package study.practice.practice44;

class Marine extends Unit { // 보병

	@Override
	void move(int x, int y) {
		System.out.printf("보병이 x:%d y:%d 위치로 걷는다", x,y);
	}

	void stimPack() { 
		System.out.println("스팀팩을 사용한다");
	} //스팀팩을 사용한다

	
	
}

