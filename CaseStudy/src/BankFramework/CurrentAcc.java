package BankFramework;

public class CurrentAcc extends BankAcc {
	protected float creditLimit=5000;
	public CurrentAcc(int accNo ,String accname, float accBal) {
		super(accNo,accname,accBal);
	}
public float getCreditLimit() {
	return creditLimit;
}
public void setCreditLimit(float creditLimit) {
	this.creditLimit = creditLimit;
	
}

}
