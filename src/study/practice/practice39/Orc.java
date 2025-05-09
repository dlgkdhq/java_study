package study.practice.practice39;

class Orc {
	protected String name;
	protected int hp;

	public Orc(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public String toString() {
		String str1 = String.format("Orc { name : %s, hp : %d}", name, hp);
		return str1;
	}
}
