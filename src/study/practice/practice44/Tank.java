package study.practice.practice44;

class Tank extends Unit { // 탱크

	@Override
	void move(int x, int y) {
		System.out.printf("탱크가 x:%d y:%d 위치로 굴러간다",x,y);
	}

	void changeMode() { 
		System.out.println("공격모드를 변환한다");
	} //공격모드를 변환한다

}
