package study.practice.practice35;

public class ChineseRestaurant {
    public static void main(String[] args) {
        // 주문을 위한 메뉴 선정
        Menu jjajang = new Menu("짜장", 4900);
        Menu jjambbong = new Menu("짬뽕", 5900);
        Menu tangsook = new Menu("탕수육", 13900);

        // 메뉴를 조합하여 주문을 생성
        Menu[] menuArr = { jjajang, jjambbong, tangsook };
        Order order = new Order(123, menuArr);

        // 주문 결과 출력
        System.out.printf("주문 합계: %d원\n", order.totalPrice());
        
        Menu[] menuArr2 = {new Menu("짬뽕", 5900), new Menu("짜장", 4900)};
        Order order2 = new Order(124, menuArr2);		//설명할 때 추가하신 것
        System.out.printf("[주문번호 %d] 주문 합계 : %d원\n", order2.orderNum, order2.totalPrice());
    }
}

class Order {
    // 필드
    int orderNum;
    Menu[] menus;

    // 생성자
    public Order(int i, Menu[] arr) {
        orderNum = i;
        menus = arr;
    }

    // 총합 계산 메서드
    public int totalPrice() {
    	/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
    	
    	//주문한 메뉴는 menus에
    	//메뉴당 금액은 menus -> Menu -> price
        int sum = 0;
        for (int i=0; i<menus.length; i++) {
            sum = sum + menus[i].price;
        }
        
        //향상된 for문 이용
//        for(Menu menu : menus) {
//        	sum += menu.price;
//        }
        
        return sum;
    }
}

class Menu {
    // 필드
    String name;
    int price;

    // 생성자
    public Menu(String str, int i) {
        name = str;
        price = i;
    }
}