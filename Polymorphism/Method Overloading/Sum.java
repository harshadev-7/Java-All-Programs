
import java.util.Scanner;

public class Sum 
{
    int n;
    int m;
    int [] a ;
    double [] b ;

    int Sum(int[] a)
    {
        int sum = 0;
        for (int i : a) 
        {
            sum +=i;            
        }
        return sum;

    }
    double Sum(double[] b)
    {
        double sum = 0;
        for (double i : b) 
        {
            sum += i;
            
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Sum obj = new Sum();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size  of integer array");
        obj.n = sc.nextInt();
        obj.a = new int[obj.n];
        System.out.println("enter size of double array");
        obj.m = sc.nextInt();
        obj.b = new double[obj.m];
        System.out.println("enter the elements in an integer array");
        for (int i = 0; i< obj.a.length; i++)
        {
            obj.a[i] = sc.nextInt();

        }
        System.out.println("enter the elements in a double array");
        System.out.println("array of sum"+obj.Sum(obj.a));
        for(int i =0 ; i< obj.b.length;i++)
        {
          obj.b[i] = sc.nextDouble();
        }
        System.out.println("array of sum using double"+obj.Sum(obj.b));    
        sc.close();
    }
}
