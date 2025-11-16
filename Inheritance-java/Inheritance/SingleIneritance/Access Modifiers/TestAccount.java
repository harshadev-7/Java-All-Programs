import java.util.Scanner;
class BankAccount
{
	protected double balance;
	public BankAccount(double balance)
	{
		this.balance = balance;
	} 
	public void deposit(double deposit){
	if(deposit>0)
	{
		System.out.println("Total amount"+(balance+=deposit));
	}
	else {
		System.out.println("invalid");
		}
	}
	public void withdraw(double withdraw)
	{
		if(withdraw > 0  && balance>=withdraw)
		{
			System.out.println("withdraw amount is"+(balance-=withdraw));
		}
		else
		{
			System.out.println("invalid to withdraw");
		}
	}
	void currentbalance()
	{
		System.out.println("current balance"+balance);
	}
	public static void printMenu() {
    System.out.println("Enter your choice:");
    System.out.println("1. Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Interest");
    System.out.println("0. Exit");
}
}
class Saveaccount extends BankAccount
{
	public Saveaccount(double balance)
	{
		super(balance);
	}
	public void interest(double rate)
	{
		double interest = balance * rate/100;
		System.out.println("rate of interest is"+interest);
	}

	
}
public class TestAccount
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double n = 4000000;
		Saveaccount save = new Saveaccount(n);
		Boolean running = true;
		while(running)
		{
			int choice = scan.nextInt();
			BankAccount.printMenu();
			switch(choice)
			{
				case 1:
			{
				save.currentbalance();
				break;
			}
			case 2:
			{
				System.out.println("deposit the amount to the bank");
				n = scan.nextDouble();
				save.deposit(n);
				break;
			}
			case 3:
			{
				System.out.println("enter the amount you want to with draw");
				n = scan.nextDouble();	
				save.withdraw(n);
				break;
			}
			case 4:
			{
				System.out.println("enter the interest rate % :");
				n = scan.nextDouble();
				save.interest(n);
				break;
			}
			case 0:
			{
				running = false;
				System.out.println("Thank you for banking with as");
				break;	
			}
			default:
			System.out.println("invalid option");
	
		}
		}
				
		scan.close();
		

	}
}