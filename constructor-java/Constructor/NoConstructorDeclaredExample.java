class NOConstructor
{
    int a;
    String name;
    double d;
    boolean flag;
    void display()
    {
        System.out.println(a+" --"+name+" --"+d+" --"+flag);
    }
}
public class NoConstructorDeclaredExample {
    public static void main(String[] args) {
        NOConstructor n1 = new NOConstructor();
        NOConstructor n2 = new NOConstructor();
        n1.display();   
        n2.display();
    }
    
}
