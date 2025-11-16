interface A 
{
	default void display()
	{
		System.out.println("print a");
	}
}
interface B
{
	default void display()
	{	
		System.out.println("print b");
	}
}
class C implements A, B
{
	@Override
	public void display()
	{
		System.out.println("print c");
		A.super.display();
		B.super.display();
	}
	void number(){
	A.super.display();
	}
}
public class SupercallsMethodOverriding
{
	public static void main(String[] args)
	{
		C c = new C();
		c.display();
		c.number();
	}
}