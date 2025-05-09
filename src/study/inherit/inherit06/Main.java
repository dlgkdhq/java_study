package study.inherit.inherit06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		d.drive(b);
		d.drive(t);
		
		Bus b2 = takeBus();
		Taxi t2 = takeTaxi();
		
		//Bus b3 = takeTaxi();	//타입 다름
		//int b3 = "abc";
		
		Vehicle v = takeTaxi();
		Vehicle v2 = new Taxi();
		Vehicle v3 = takeBus();
		Bus b3 = takeBus();
		
		//Bus b4 = takeVehicle(); //타입 다름!
		Vehicle v4 = takeVehicle();
		
		//------------------------------------------
		
		Vehicle vv = new Vehicle();
		
		Vehicle vv2 = new Bus();
		//vv2.run();		O
		//vv2.start();		X -> vv2는 start 사용법을 모르니까!!
		Bus bb = new Bus();
		bb.run();
		bb.start();
		
		Bus bb2 = (Bus)vv2;	//강제 형변환
		bb2.start();
		
//		Bus bb3 = (Bus)vv;
//		bb3.start(); 		//오류남 -? - 몸체가 다르니까
		
		//-------------------------------------------
		Vehicle vv4 = takeVehicle();
		
		Bus bbb = (Bus)vv4;
		bbb.start();
		
	}
	
	public static Bus takeBus() {
		//Bus b = new Bus();
		return new Bus();
	}
	
	public static Taxi takeTaxi() {
		//Taxi t = new Taxi();
		return new Taxi();
	}
	
	public static Vehicle takeVehicle() {	//부모타입으로 다 리턴할 수 있음
		//Vehicle v = new Taxi();
		
//		return new Vehicle();
//		return new Bus();
//		return new Taxi();
		
		int n = (int)(Math.random()*2) + 1;
		if(n==1) {
			return new Bus();
		} else {
			return new Taxi();
		}
	}
}
