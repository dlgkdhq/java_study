package study.practice.practice39;

class OrcWarrior extends Orc{
	protected int amor;

	public OrcWarrior(String name, int hp, int amor) {
		super(name, hp);
		this.amor = amor;
	}

	// 메소드 오버라이딩!
	public String toString() {
		String str2 = String.format("OrcWarrior { name : %s, hp : %d, amor: %d}", name, hp, amor);
		return str2;

	}
}