package BankFramework;

public class SavingAcc extends BankAcc {
	public SavingAcc(int accNo ,String accname, float accBal) {
		super(accNo ,accname, accBal);
		this.isSalary=isSalary;
	}
	private static boolean isSalary=true;
	
	public boolean isIsSalary() {
		return isSalary;
	}
public void setisSalary(boolean isSalary) {
	this.isSalary = isSalary;
}
public String toString() {
	return "SavingAcc [isIsSalary()=" +isIsSalary()+",getAccNo()="+getAccNo()+",getAccname()="+getAccname()+",getAccBal()="+getAccBal()+"]";
	
}

}
