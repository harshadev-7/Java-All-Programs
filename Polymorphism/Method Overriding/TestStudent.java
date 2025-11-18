abstract class Student
{
    String name;
    int totalmarks;
    abstract void result();
    abstract void display();
}
class UGstudent extends Student
{

    public UGstudent(String name, int totalmarks) 
    {
        this.name = name;
        this.totalmarks = totalmarks;
    }
    void display()
    {
        System.out.println("name of the UGstudent : " +name);
        System.out.println("total marks of the UGstudent : "+totalmarks);
    }
    void result()
    {
        if(totalmarks >= 50)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("failed");
        }
    }
    
}
class PGstudent extends Student
{

    public PGstudent(String name, int totalmarks) 
    {
        this.name = name;
        this.totalmarks = totalmarks;

    }
    void result()
    {
        if(totalmarks >= 60)
        {
            System.out.println("passed");
        }
        else
        {
            System.out.println("failed");
        }

    }
    void display()
    {
        System.out.println("name of the PGstudent : "+name);
        System.out.println("total marks of the PGstudent : "+totalmarks);
    }
    
}
public class TestStudent
{
    public static void main(String[] args)
    {
        Student obj1 = new UGstudent("Harsha", 50);
        obj1.display();
        obj1.result();
         System.out.println("********************************");
        Student obj2 = new UGstudent("mani", 45);
        obj2.display();
        obj2.result();
         System.out.println("*********************************");
        Student obj3 = new PGstudent("gowthami", 90);
        obj3.display();
        obj3.result();
        
    }
}