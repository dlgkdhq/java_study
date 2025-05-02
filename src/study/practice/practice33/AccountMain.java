package study.practice.practice33;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ATM
 		Account a1 = new Account("나", 50000);
 		long insertMoney = 30000;
		
		//return balance 입금 후 잔액 케이스
//		long result = a1.deposit(insertMoney);
//		System.out.println("입금액 : "+insertMoney);
//		System.out.println("입금 후 잔액 : "+result);
		
		//return amount 입금액 케이스
		long result = a1.deposit(insertMoney);
		System.out.println("입금액 : "+result);
		System.out.println("입금 후 잔액 : "+a1.getBalance());
		
		long result2 = a1.withdraw(150000);
		if(result2 == 0) {
			System.out.println("잔액 부족 이슈");
		}
		
		a1.deposit(500000);
 		System.out.println("입금 후 잔액 : " + a1.getBalance());
 		
 		result2 = a1.withdraw(150000);
 		if(result2 == 0) {
 			System.out.println("잔액 부족으로 인출 실패");
 		}
 		
 		System.out.println("출금 후 잔액 : " + a1.getBalance());
	}

}
