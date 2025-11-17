public class Max
{
    int max(int a, int b)
    {
        return (a>b)? a :b;
    }
    int max(int a, int b , int c)
    {
        return max(max(a,b),c);
    }
    static double max(double a, double b)
    {
        return (a>b)? a : b;
    }
    public static void main(String[] args) 
    {
        Max objMax = new Max();
        System.out.println("the maximaum of two numbers is"+objMax.max(5,6));
        System.out.println("the maximaum of two numbers is "+objMax.max(10, 20,30));
        System.out.println("maximum in double datatype"+Max.max(10.6,20.9));

        
    }
}