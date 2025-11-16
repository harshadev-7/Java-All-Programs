
import java.util.Scanner;
class Add
{
	//private int a;
	//private int b;
	//private int c;
	Add(int a, int b)
	{	
		//this.a = a;
		//this.b = b;
		int sum = a+b;
		System.out.println("the sum of two numbers"+sum);
	}
	Add(int a, int b, int c)
	{
		//this.a = a;
		//this.b = b;
		//cthis.c = c;
		int sum = a+b+c;
		System.out.println("the sum of three numbers"+sum);
	}
	Add(double a , double b)
	{
		double sum = a+b;
		System.out.println("the sum of two numbers"+sum);
	}
	
}
public class Testadd
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers to add :");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		new Add(n1 , n2);
		System.out.println("enter three numbers to add :");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		new Add(a, b, c);
		System.out.println("enter two numbers based double datatype");
		double d1 = scan.nextInt();
		double d2 = scan.nextInt();
		new Add(d1, d2);
	}
}