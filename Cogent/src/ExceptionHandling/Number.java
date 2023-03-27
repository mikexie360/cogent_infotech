package ExceptionHandling;

public class Number {
	int firstNumber;
	int secondNumber;
	double result;
	
	public Number(int x, int y) {
		firstNumber = x;
		secondNumber = y;
	}
	
	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void add() {
		result = firstNumber + secondNumber;
	}
	public void sub() {
		result = firstNumber - secondNumber;
	}
	public void mul() {
		result = firstNumber * secondNumber;
	}
	public void div() throws ArithmeticException {
		try {
			result = firstNumber / secondNumber;
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Divide by Zero Error!");
		}
	}
}
