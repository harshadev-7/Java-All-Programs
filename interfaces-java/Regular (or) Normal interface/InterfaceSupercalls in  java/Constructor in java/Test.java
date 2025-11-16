class A
{
    int x;
    String name;
    A(int x, String name)
    {
        this.x = x;
        this.name = name;
    }
}
class B extends A
{
    int y;
    B(int x, String name, int y)
    {
        super(x, name);
        this.y = y;
    }   
    void display()
    {
        System.out.println("x = " + x + ", name = " + name + ", y = " + y);
    }
}
public class Test
{
    public static void main(String[] args)
    {
        B b = new B(10, "Hello", 20);
        b.display();
    }
}
