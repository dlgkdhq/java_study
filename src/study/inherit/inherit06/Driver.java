package study.inherit.inherit06;

public class Driver {
//	public void drive(Bus bus) {	//메소드 오버로딩
//		System.out.println("Driver 운전 시작");
//		bus.run();
//	}
//	
//	public void drive(Taxi taxi) {  //메소드 오버로딩
//		System.out.println("Driver 운전 시작");
//		taxi.run();
//	}
	
					//Vehicle vehicle = b; new Bus();	
					//Vehicle vehicle = t; new Taxi();
	public void drive(Vehicle vehicle) {	//매개변수의 다형성
		System.out.println("Driver 운전 시작");
		vehicle.run();
	}
}
