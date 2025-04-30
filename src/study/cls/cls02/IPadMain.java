package study.cls.cls02;

import java.util.Scanner;

public class IPadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IPad pad1 = new IPad();
		pad1.owner = "이하옵";
		
		pad1.powerOn();
		
		IPad pad2 = new IPad();
		pad2.owner = "방졍식";
		
		pad2.powerOn();
		
		Scanner scanner = new Scanner(System.in);
		
		String ss = "123";
		int ii = Integer.parseInt(ss);
		
		int num = (int)(Math.random()*6)+1 ; 
		System.out.println(Math.PI);
		
		IPad.check();
		//pad2.check(); 
		
		System.out.println(IPad.brand);
		//System.out.println(pad1.brand);  권장x 클래스명으로
	}

}
