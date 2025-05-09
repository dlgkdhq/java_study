package study.practice.practice39;

public class SuperTest {

	public static void main(String[] args) {
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		
		Orc orc = new Orc("오크", 80);
		String str1 = orc.toString();
		System.out.println(str1);
		
		
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior ow = new OrcWarrior("오크전사", 120, 3);
		String str2 = ow.toString();
		System.out.println(str2);
	}
}


