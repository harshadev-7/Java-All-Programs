import java.util.Arrays;
import java.util.Scanner;
public class AslistusingWapperclass {
    public static void main(String[] args) {
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n = scan.nextInt();
        Integer arr[] = new Integer[n];
        System.out.println("enter the elements in an array:");
        for (i =0;i < arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
            System.out.println(Arrays.asList(arr));
        
    }
}
