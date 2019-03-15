import java.util.ArrayList;

public class ProgramLogic {

	private long balance=0;
	public ArrayList<String> history = new ArrayList<String>();
	int i=0;
	int j=0;
	
	public String Previous() { 
		
		String x;
		if(j<=i) {
			x=history.get(i-j-1);
			j++;
			return x;
		}
		else
		{
			return x=null;
		}
	}
	
	public String Next() {
		String y;
		if(j>1)
		{
			y=history.get(i-j+1);
			j--;
			return y;
		}
		else
		{
			return y=null;
		}
	}
	
	public void Deposit(long amount) {
		
			balance=balance+amount;
			
			if(history.size()==5)
			{
				history.remove(0);
				i--;
			}
				history.add("Last transaction was Deposit and the amount added was "+amount);
				i++;
	}
	
	public boolean WithDraw(long amount) {
		
		boolean x;
		
		if(history.size()==5)
		{
			history.remove(0);
			i--;
		}
		if(amount<=balance) {
			balance=balance-amount;
			x=true;
			history.add("Last transaction was WithDraw and the amount was "+amount);
			i++;
		}
		else
		{
			x=false;
		}
		return x;
	}
	public long GetCurrentBalance() {
		if(history.size()==5)
		{
			history.remove(0);
			i--;
		}
		history.add("Last operation was Balance Inquiry and the balance is "+balance);
		i++;
		return balance;
	}
	
}