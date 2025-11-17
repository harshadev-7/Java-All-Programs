import java.util.Arrays;
import java.util.Scanner;

public class BInarysearch
{
    public static void main(String[] args)
    {
    int [] a = new int[10];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the elements in an array");
    for(int i = 0 ; i< a.length;i++)
    {
        a[i ]=sc.nextInt();

    }
    System.out.println("enter you element you want to search");
    int key = sc.nextInt();
    Arrays.sort(a);
    Arrays.binarySearch(a, key);
    sc.close();
    }
}