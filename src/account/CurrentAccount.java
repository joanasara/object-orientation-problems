package account;

public class CurrentAccount {

	String number;
	String agency;
	boolean special;
	double specialLimit;
	double balance;
	double special_Value_Used;

	boolean makeWithdrawals(double Amount_To_Withdraw) {
		if (balance >= Amount_To_Withdraw) {
			balance -= Amount_To_Withdraw;
			return true;
		} else {
			if (special) {
				double limit = special_Value_Used - balance;
				if (limit >= Amount_To_Withdraw) {
					balance -= Amount_To_Withdraw;
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}

	void deposit(double deposited_Amount) {
		balance += deposited_Amount;
	}

	void check_Balance() {
		System.out.println("the account balance and " + number + " = " + balance);
	}
    
	boolean check_Overdraft() {
		return balance < 0;
	}










}
