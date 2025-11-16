import java.util.Scanner;
class Calculator
{
	double add(double a, double b)
	{
		return a+b;
	}
	double sub(double a, double b)
	{
		return a-b;
	}
	double multi(double a , double b)
	{
		return a*b;
	}
	double divi(double a, double b)
	{
		return a/b;
	}
	double modulus(double a, double b)
	{
		return a%b;
	}
}
class Scientific extends Calculator
{
	double sqrt(double a)
	{
		return Math.sqrt(a);
	}
	double expo(double a , double b)
	{
		return Math.pow(a,b);
	}
}
public class Caiso
{
	public static void main(String[] args)
	{
		Scientific cal =new Scientific();
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("--- Scentific Caluclator-----");
			System.out.println("1.Add");
			System.out.println("2.Sub");
			System.out.println("3.multi");
			System.out.println("4.divi");
			System.out.println("5.modulus");
			System.out.println("6.sqrt");
			System.out.println("7.expo");
			double a=scan.nextDouble();
			double b=scan.nextDouble();
			int choice=scan.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("enter two number you want to add");
					/*double a = scan.nextDouble();
					double b = scan.nextDouble();*/
					System.out.println(cal.add(a,b));
					break;
				}
				case 2:
				{
					System.out.println("enter two number you want to sub");
					/*double a = scan.nextDouble();
					double b = scan.nextDouble();*/
					System.out.println(cal.sub(a,b));
					break;
					
				}
				case 3:
				{
					System.out.println("enter two numbers u want to multi");
					/*double a = scan.nextDouble();
					double b = scan.nextDouble();*/
					System.out.println(cal.multi(a,b));
					break;
				}
				case 4:
				{
					System.out.println("enter two numbers you want divi");
					/*double a = scan.nextDouble();	
					double b = scan.nextDouble();*/
					if(b!=0){	
					System.out.println(cal.divi(a,b));
					}
					else System.out.println("division is not possible");
					break;
				}
				
				case 5:
				{
					System.out.println("enter two numbers you want to modolus");
					/*double a = scan.nextDouble();
					double b = scan.nextDouble();*/
					System.out.println(cal.modulus(a,b));
					break;
				}
				case 6:
				{
					System.out.println("enter the number u want to sqrt ");
					/*double a = scan.nextDouble();*/
					System.out.println(cal.sqrt(a));
					break;
				}
				case 7:
				{
					System.out.println("enter the base and expo");
					/*double a = scan.nextDouble();
					double b = scan.nextDouble();	*/
					System.out.println(cal.expo(a,b));
					break;
				}
				default:
				System.out.println("invalid option");
			}
			System.out.println("do you want to continue 1/0");
		}while(scan.nextInt()==1);
			scan.close();
		}
	}

