package BankFramework;

public class BankAcc {
	public int accNo;
	public String accname;
	public float accBal;
	public BankAcc(int accNo ,String accname, float accBal) {
		this.accNo = accNo;
		this.accBal = accBal;
		this.accname = accname;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public void withdraw(float accBal) {
		System.out.println("The Deposite Balance is"+ accBal);
		
	}
	public String toString() {
		return "SavingAcc [accNo=" + accNo +",accname="+accname+"accBal="+accBal+"]";
	}

}
