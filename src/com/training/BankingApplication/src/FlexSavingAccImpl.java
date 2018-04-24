
public class FlexSavingAccImpl implements Account {

	private int interestRate= 6;
	@Override
	public int findInterest(int balance, int interestRate, int period) {
		int sInterest= (balance*interestRate*period)/100;
		return sInterest;
	}}
