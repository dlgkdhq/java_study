package study.cls.cls04;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Singleton st1 = new Singleton();
//		Singleton st2 = new Singleton();
//		Singleton st3 = new Singleton();
//		Singleton st4 = new Singleton();
		
		Singleton st = null;
		
		//Singleton ss = new Singleton();
		//ss.singleton
		//st = Singleton.singleton;   -> private 에서는 사용불가, static 에서는 가능
		
		st = Singleton.getInstance();
		
		Singleton st2 = Singleton.getInstance();
		Singleton st3 = Singleton.getInstance();
	}

}
