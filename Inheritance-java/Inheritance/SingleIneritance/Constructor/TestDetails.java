class Person
{
	int age;
	String name;
	Person( int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	void display()
	{
		System.out.println("age"+age);
		System.out.println("name"+name);
	}
}
class Employee extends Person
{
	int Salary;
	Employee(int age, String name , int Salary)
	{
		super(age,name);
		this.Salary = Salary;
	}
       // @Override
	void display()
	{
		System.out.println("age"+age);
		System.out.println("name"+name);
		System.out.println("Salary"+Salary);
	}
}
public class TestDetails
{
	public static void main(String[] args)
	{
		Employee E = new Employee(25, "Harsha", 50000);
		E.display();
		System.out.println();
		Person p = new Person(29, "Stephen");
		p.display();
	}
}
