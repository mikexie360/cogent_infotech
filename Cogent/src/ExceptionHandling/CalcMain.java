package ExceptionHandling;
import java.util.Scanner;
public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String userIn = "";
		Number num = new Number(0,0);
		
		BankAccount bank = null;
		try {
			bank = new BankAccount(1,"Mike","Savings",10000);
		} catch (LowBalanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Low Balance!");
		} catch (NegativeAmount e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error Negative Amount!");
		}
		
		do {
			System.out.println("-----------Menu-----------");
			System.out.println("0-exit");
			System.out.println("1-add");
			System.out.println("2-sub");
			System.out.println("3-mul");
			System.out.println("4-div");
			System.out.println("5-make a bank account");
			System.out.println("6-deposit");
			System.out.println("7-withdraw");
			System.out.println("8-getBalance");
			System.out.println("9-CalcAverage");
						
			switch(Integer.parseInt(sc.next())) {
				case 0:
					System.exit(0);
					break;
				case 1:
					System.out.println("Enter two numbers to add");
					num.setFirstNumber(Integer.parseInt(sc.next()));
					num.setSecondNumber(Integer.parseInt(sc.next()));
					num.add();
					System.out.println("The sum is: "+num.getResult());
					break;
				case 2:
					System.out.println("Enter two numbers to subtract");
					num.setFirstNumber(Integer.parseInt(sc.next()));
					num.setSecondNumber(Integer.parseInt(sc.next()));
					num.sub();
					System.out.println("The difference is: "+num.getResult());
					break;
				case 3:
					System.out.println("Enter two numbers to multiply");
					num.setFirstNumber(Integer.parseInt(sc.next()));
					num.setSecondNumber(Integer.parseInt(sc.next()));
					num.mul();
					System.out.println("The product is: "+num.getResult());
					break;
				case 4:
					System.out.println("Enter two numbers to divide");
					num.setFirstNumber(Integer.parseInt(sc.next()));
					num.setSecondNumber(Integer.parseInt(sc.next()));
					try {
						num.div();
						System.out.println("The division is: "+num.getResult());
					} catch (ArithmeticException e) {
						//e.printStackTrace();
						System.out.println("Divide by zero error!");
					}
					break;
				case 5:
					System.out.println("Enter\n Bank Account Number\n Customer Name\n Account Type\n Balance");
					try {
						bank = new BankAccount(sc.nextInt(),sc.next(),sc.next(),sc.nextFloat());
					} catch(LowBalanceException e) {
						//e.printStackTrace();
						System.out.println("Low Balance");
					} catch(NegativeAmount e) {
						//e.printStackTrace();
						System.out.println("Balance negative amount");
					}
					break;
				case 6:
					System.out.println("Enter a deposit");
					try {
						bank.deposit(sc.nextFloat());
					} catch (NegativeAmount e){
						//e.printStackTrace();
						System.out.println("Cannot enter a negative deposit");
					}
					break;
				case 7:
					System.out.println("Enter a withdraw");
					try {
						bank.withdraw(sc.nextFloat());
					} catch (InsufficientFunds e){
						//e.printStackTrace();
						System.out.println("Insufficient Funds");
					} catch (NegativeAmount e) {
						//e.printStackTrace();
						System.out.println("Cannot enter a negative deposit");

					}
					break;
				case 8:
					System.out.println("Get your balance");
					try {
						System.out.println(bank.getBalance());
					} catch (LowBalanceException e) {
						//e.printStackTrace();
						System.out.println("Low Balance");

					}
					break;
				case 9:
					System.out.println("Enter an Integer");
					CalcAverage avg = new CalcAverage();
					try {
						System.out.println( avg.avgFirstN(sc.nextInt()));
					} catch (IllegalArgumentException e) {
						System.out.println("Not a Natural Number");
					}
				default:
					break;
			}
			
		} while(true);
		
	}

}
