package ExceptionHandling;

public class LowBalanceException extends Exception{
	public LowBalanceException(String s) {
		super(s);
	}
}
