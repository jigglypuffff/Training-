
public class CheckingAccImpl implements Account{

	private int interestRate= 4;
	@Override
	public int findInterest(int balance, int interestRate, int period) {
		int sInterest= (balance*interestRate*period)/100;
		return sInterest;
	}

	
}
