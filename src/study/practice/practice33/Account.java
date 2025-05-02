package study.practice.practice33;

public class Account {
//	· 다음의 2 개의 필드를 선언
	private String owner;	//계좌 소유주
	private long balance;	//잔액 
	

//	· 위 모든 필드를 사용하는 가능한 모든 생성자의 구현
	//생성자
	public Account() {
		owner = null;
		balance = 0;	//초기화
	}
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	public Account(long balance) {
		owner = null;
		this.balance = balance;
	}
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public Account(long balance, String owner) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
//	· 위 모든 필드에 대한 getter와 setter의 구현
	//getter setter 메소드
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}

//	· 메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드
//	public long deposit(long amount)
//	· 메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
//	public long withdraw(long amount)
//	· Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한 저축과 인출을 수행한 후 잔금을 출력
//	메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
//	· 인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
//	· 클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력
	
	//			입금 		(입금할 금액)
	public long deposit(long amount) {
		//계좌 잔액 5만 		3만 입금 => 잔액 8만
		balance += amount;
		
		//return  1)입금액   or    2) 입금 후 잔액
		
		return amount; //1)입금한 금액 -> 3만
		//return balance; //2)입금 후 잔액 리턴 -> 8만
	}
	//			인출		(인출할 금액)
	public long withdraw(long amount) {
		if(balance < amount) {
//			System.out.println("잔액 부족");
			return 0;
		}
		
		balance -= amount;
		return amount;	//인출한 금액 리턴
		
		
		
	}
}
