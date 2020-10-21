package chap10.textbook.s100701;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();  // 어디서 exception이 실제로 발생했고 메소드 실행 루트를 찾아줌
		}
	}
}
