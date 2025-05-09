package study.inherit.inherit03;

public class MikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mike m1 = new Mike();
		m1.volumeUp();
		
		WirelessMike wm1 = new WirelessMike();
		wm1.volumeUp();
		
		BluetoothMike bm1 = new BluetoothMike();
		bm1.volumeUp();
		bm1.volumeUp(5);
		
		Mike m2 = new WirelessMike();	//부모타입변수에 자식변수 담기 가능
		Mike m3 = new BluetoothMike();	//부모클래스를 상속받아서 가능함
		
		m2.volumeUp();
		m3.volumeUp(); //재정의된 volumeUp()이 불림
		//m3.connect(); //불가능
		m3.check();
		
		bm1.check();
		
		//BluetoothMike bm2 = new WirelessMike(); //불가능
		//BluetoothMike bm2 = new Mike(); //불가능
		
		BluetoothMike bm2 = new BluetoothMike();
		bm2.isConnect = true;
		bm2.model = "성능굿마이크";
		bm2.price = 5000;
		bm2.type = "핀마이크";
		
		String str2 = bm2.toString();
		System.out.println(str2 + " 이런 정보 있는 마이크 샀음");
		
		//Mike m3 = new BluetoothMike();
		m3.check();
		System.out.println(m3.toString());
		
		//Mike m2 = new WirelessMike();
		System.out.println(m2.toString());
		
		//Mike m1 = new Mike();
		m1.model = "일반마이크";
		System.out.println(m1.model);
		System.out.println(m1);
		//객체 자체를 출력 -> toString() 결과를 출력
		
		//모든 애들의 공통된 부모클래스니까 다 담을 수 있음
		Object o1 = m1;
		o1 = m2;
		o1 = m3;
		o1 = bm1;
		o1 = bm2;
	}

}
