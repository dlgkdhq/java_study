package study.cls.cls03.pack1;

import study.cls.cls03.pack2.Cup;
//import를 하면 본 페이지에서 Cup클래스 사용 시 import한 클래스로 인식

public class CupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//상단에 import가 없으면 동일 패키지 클래스로 인식
		Cup c1 = new Cup();
		c1.method();
		
		study.cls.cls03.pack2.Cup c2 = new study.cls.cls03.pack2.Cup(); 
		//import 안하고 사용하는 방법 = 풀네임으로 적어줌
		c2.method();
		
		//pack2로 import 했는데 pack1에 있는 Cup 클래스를 쓰려면 
		//pack1 풀네임으로 적어줌
		study.cls.cls03.pack1.Cup c3 = new study.cls.cls03.pack1.Cup();
		c3.method();
		
		//c2.b
		//c3.a -> 같은 패키지 pack1 안에 있어서 사용 가능
		//c3.b
		
	}

}
