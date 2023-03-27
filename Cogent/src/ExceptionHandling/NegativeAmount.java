package ExceptionHandling;

public class NegativeAmount extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NegativeAmount(String s){
		super(s);
	}
}