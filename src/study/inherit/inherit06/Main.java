package study.inherit.inherit06;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		d.drive(b);
		d.drive(t);
	}

	public static Bus takeBus() {
		//Bus b = new Bus();
		return new Bus();
	}
	
	public static Taxi takeTaxi() {
		//Taxi t = new Taxi();
		return new Taxi();
	}
}
