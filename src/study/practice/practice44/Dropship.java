package study.practice.practice44;

class Dropship extends Unit { // 수송선

	@Override
	void move(int x, int y) {
		System.out.printf("수송선이 x:%d y:%d 위치로 날아간다",x,y);
	}
	
	void load() { 
		System.out.println("선택된 대상을 태운다");
	} //선택된 대상을 태운다
	
	void unload() {
		System.out.println("선택된 대상을 내린다");
	} //선택된 대상을 내린다

}
