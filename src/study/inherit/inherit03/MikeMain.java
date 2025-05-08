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
		
		
	}

}
