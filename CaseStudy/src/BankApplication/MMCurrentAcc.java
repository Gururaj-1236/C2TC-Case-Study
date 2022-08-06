package BankApplication;
import BankFramework.CurrentAcc;
public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accname, float accBal) {
		super(accNo, accname, accBal);
		
	}
	
	
	public void withdraw(float accBal) {
		System.out.println("You Have Total  Amount Is"+accBal);
}
}
