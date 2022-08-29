package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();

		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		//출금하기
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			//e.printStackTrace();			에러 코드 찾아주는 것(개발자 전용)	사용 후 삭제or주석처리
		}
	}

}
