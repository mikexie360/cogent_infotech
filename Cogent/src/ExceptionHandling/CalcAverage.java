package ExceptionHandling;

public class CalcAverage {
	public CalcAverage() {
		super();
	}
	
	public double avgFirstN(int N) throws IllegalArgumentException {
		if (N <1) {
			throw new IllegalArgumentException("Not a Natural Number");
		}

		double sum = 0;
		for (int  i = 1; i <=N ; i++) {
			sum += i;
		}
		return sum/N;
	}
}
