package sec07_user_define_exception;

public class Account {
	private long balance;
	public Account() { }
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientException{  //throws는 던진거 throw는 예외발생시키는것
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족:"+(money-balance)+" 모자람");
		}
		
		balance -= money;
	}
}
