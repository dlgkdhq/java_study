package study.practice.practice43;

public class Food {

	String name;	//이름
	int price;		//가격
	int stock; 		//재고
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
		stock = 5;	//음식 재고 초기화 (초기에 5개 재고가 있다고 가정)
	}
	
	//나중에 개별적으로 넣어주는 것 보다 생성할 때 new food("김밥", 3000) 하는게 편하니까..
	public String toString() {	//메소드 이름은 toString 말고 다른거 써도 무관, ex) getFoodInfo()
		return String.format("%s 가격:%d원 재고:%d", name, price, stock);
	}
	
	public String getFoodInfo() {
		return String.format("%s 가격:%d원 재고:%d", name, price, stock);
	}
	
	//재고 조절(설정)하는 메소드
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//addStock(int count) -> stock + count
	//subStock(int count) -> stock - count
	
	//재고 갯수 조정			//modifyStock(5)  modifyStock(-3)
	public void modifyStock(int count) {
		
		//재고 3개, 5개 주문한 상황
		//1) 주문불가
		//2) 최대 갯수까지만 처리
		if(stock + count < 0) {
			stock = 0;
		} else {
			this.stock += count;
		}

		
	}
	
}
