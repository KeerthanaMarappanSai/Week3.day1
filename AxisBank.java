package week3.day1assign3;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("Deposit Method Overridding");
	}
	
	public static void main(String[] args) {
		
		AxisBank axis=new AxisBank();
		
		axis.fixed();
		axis.savings();
		axis.deposit();
	}
}
