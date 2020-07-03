package account;

public class TestCurrentAccount {

	public static void main(String[] args) {
	  
		CurrentAccount account = new CurrentAccount();
		account.number = "879856324";
		account.agency = "1452";
		account.special = true;
		account.specialLimit = 500;
		account.balance = -10;
		account.special_Value_Used = 0;
		
		
		
		account.check_Balance();
		
		boolean withdrawal_Made = account.makeWithdrawals(10);
		System.out.println("attempted withdrawal of 500 reais");
		if(withdrawal_Made) {
		System.out.println("successful withdrawal");
		account.check_Balance();
		}else {
			System.out.println("it was not possible to make a balance, an insufficient balance");
		}
		System.out.println("deposited amount");
		account.deposit(500.0);
		account.check_Balance();
		
		if(account.check_Overdraft()) {
			System.out.println("is using overdraft");
		}else {
			System.out.println("not using overdraft");
		}
	}
	

}
