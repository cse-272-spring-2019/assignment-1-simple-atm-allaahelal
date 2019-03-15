
public class authentication {
	String test="0000";
	public boolean validate(String cardnum) {
		boolean result;
		if(cardnum.equals(test)) {
			result=true;
		}
		else {
			result=false;
		}
		return result;
	}
	
}
	
