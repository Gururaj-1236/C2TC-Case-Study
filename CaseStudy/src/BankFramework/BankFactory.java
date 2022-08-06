package BankFramework;

public interface BankFactory {
	public SavingAcc getNewSavingAccount(int accNo ,String accname, float accBal);
	public CurrentAcc getNewCurrentAccount(int accNo ,String accname, float accBal);
	

}
