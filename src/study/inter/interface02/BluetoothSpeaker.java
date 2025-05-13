package study.inter.interface02;

public class BluetoothSpeaker implements Connectable{

	//블루투스 스피커
	
	//소리가 나는 블루투스로 연결할 수 있어야함
	@Override
	public void connect() {
		System.out.println("스피커 블루투스 연결");
	}

	@Override
	public void disconnect() {
		System.out.println("스피커 블루투스 연결종료");
	}
	
}
