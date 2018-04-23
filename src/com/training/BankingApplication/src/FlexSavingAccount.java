
public class FlexSavingAccount implements Account {

	private double balance;
	private double interestRate= 4;
	private int interestPeriod;
	
	
	@Override
	public double findInterest() {
		double interest= (balance*interestRate*interestPeriod)/100;
		return interest;
	}

}
