package BankApplication;
import BankFramework.SavingAcc;
public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accname, float accBal) {
		super(accNo, accname, accBal);
	}
	
public void withdraw(float accBal) {
	System.out.println("You Have Total Savings Amount Is"+accBal);
	
}
public String toString() {
	return "MMSavingAcc [isIsSalary()="+isIsSalary() + ",toString()="+super.toString()+",getAccno()="+getAccNo()+",getAccname()="+getAccname()+",getAccBal()="+getAccBal()+"]";
	
}
}
