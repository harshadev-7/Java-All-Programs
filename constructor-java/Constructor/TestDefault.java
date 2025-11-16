class Default{
    int a;
    String name;
    double d;

    public Default() 
    {

    }

    public Default(int a, String name, double d) 
    {
        this.a = a;
        this.name = name;
        this.d = d;
    }
     void display()
    {
        System.out.println(a+" --"+name+" --"+d);
    }
}
public class TestDefault
 {
    public static void main(String[] args)
     {
        Default d1 = new Default();
        Default d2 = new Default(10,"harsha", 99.999);
        d1.display();
        d2.display();
    }
}
