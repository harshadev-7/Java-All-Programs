/*  import java.util.Scanner; */
class Employee
{
	double salary;
	Employee(double salary)
	{
		this.salary = salary;
	}
	double sal()
	{
		return salary;
	}
}
class Manager extends Employee
{
	double bonus;
	Manager(double salary , double bonus)
	{
		super(salary);
		this.bonus = bonus;
	}
	@Override
	double sal()
	{
		return salary+bonus;
		
	}
	void display()
	{
		System.out.println(salary+" "+bonus);
	}
}
public class Salary
{
	public static void main(String[] args)
	{
		/*Scanner scan = new Scanner(System.in);
		System.out.println("enter the salary and bonus");
		double sal = scan.nextDouble();	
		double bon = scan.nextDouble();
		Manager sala = new Manager(sal,bon);*/
		Manager sal = new Manager(50000,5000);
		sal.display();
		System.out.println(sal.sal());
		
	}
}
