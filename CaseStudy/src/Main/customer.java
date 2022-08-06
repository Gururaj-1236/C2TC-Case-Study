package Main;

import BankApplication.MMBankFactory;
import BankApplication.MMCurrentAcc;
import BankApplication.MMSavingAcc;
import BankFramework.BankFactory;
import BankFramework.CurrentAcc;
import BankFramework.SavingAcc;


public class customer {
	public static void main(String args[])
	{
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(121,"Gururaj",5000);
		sa.withdraw(500);
		CurrentAcc ca = new MMCurrentAcc(121,"Gururaj",5000);
		ca.withdraw(500);
	}

}
