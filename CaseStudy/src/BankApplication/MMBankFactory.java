package BankApplication;
import BankFramework.BankFactory;
import BankFramework.CurrentAcc;
import BankFramework.SavingAcc;

public class MMBankFactory implements BankFactory {
	@Override
	public SavingAcc getNewSavingAccount(int accNo ,String accname, float accBal) {
		SavingAcc sa = new SavingAcc(accNo,accname,accBal);
		return sa;
	}
	public CurrentAcc getCurrentAccount(int accNo ,String accname, float accBal) {
	CurrentAcc ca = new CurrentAcc(accNo,accname,accBal);
	return ca;
}

}
