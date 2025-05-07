package study.practice.practice35;

import java.util.ArrayList;

public class ChineseRestaurant {
    public static void main(String[] args) {
        // 주문을 위한 메뉴 선정
        Menu jjajang = new Menu("짜장", 4900);
        Menu jjambbong = new Menu("짬뽕", 5900);
        Menu tangsook = new Menu("탕수육", 13900);

        // 메뉴를 조합하여 주문을 생성
        Menu[] menuArr = { jjajang, jjambbong, tangsook };
        
        ArrayList<Menu> menuList = new ArrayList<Menu>();
        menuList.add(jjajang);
        menuList.add(jjambbong);
        menuList.add(tangsook);
        
        //Order order = new Order(123, menuArr);
        Order order = new Order(123, menuList);

        // 주문 결과 출력
        System.out.printf("주문 합계: %d원\n", order.totalPrice());
        
//        Menu[] menuArr2 = {new Menu("짬뽕", 5900), new Menu("짜장", 4900), new Menu("탕수육", 13900), new Menu("탕수육", 13900)};
//        Order order2 = new Order(124, menuArr2);		//설명할 때 추가하신 것
//        System.out.printf("[주문번호 %d] 주문 합계 : %d원\n", order2.orderNum, order2.totalPrice());
        
        ArrayList<Menu> menuList2 = new ArrayList<Menu>();
        menuList2.add(new Menu("짬뽕", 5900));
        menuList2.add(new Menu("짜장", 4900));
        menuList2.add(new Menu("탕수육", 13900));
        menuList2.add(new Menu("탕수육", 13900));
        
        Order order2 = new Order(124, menuList2);
        System.out.printf("[주문번호 %d] 주문 합계 : %d원\n", order2.orderNum, order2.totalPrice());
    }
}

class Order {
    // 필드
    int orderNum;
    //Menu[] menus;
    ArrayList<Menu> menuList;

    // 생성자
//    public Order(int i, Menu[] arr) {
//        orderNum = i;
//        menus = arr;
//    }

    public Order(int i, ArrayList<Menu> menuList) {
    	 orderNum = i;
    	 this.menuList = menuList;
    }

    // 총합 계산 메서드
    public int totalPrice() {
    	/* 1. 모든 주문 메뉴의 총합을 반환하세요. */
    	
    	//주문한 메뉴는 menus에
    	//메뉴당 금액은 menus -> Menu -> price
        int sum = 0;
        
        for(int i=0; i<menuList.size(); i++) {
        	sum += menuList.get(i).price; //i인덱스 위치에 있는 Menu 객체 .price
        }
        
//        for (int i=0; i<menus.length; i++) {
//            sum = sum + menus[i].price;
//        }
        
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