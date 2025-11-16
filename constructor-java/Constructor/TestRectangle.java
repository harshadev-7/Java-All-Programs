import java.util.Scanner;
class Rectangle{
    int length;
    int breadth;
    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public Rectangle(int side){
        this.length=side;
        this.breadth=side;
    }
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }   

}
public class TestRectangle {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Enter length and breadth of rectangle:");
        int length = scan.nextInt();
        int breadth = scan.nextInt();
        Rectangle rect1 = new Rectangle(length, breadth);
        int area1 = rect1.area();
        int perimeter1 = rect1.perimeter(); 
        System.out.println("Area of rectangle: " + area1);
        System.out.println("Perimeter of rectangle: " + perimeter1);
        System.out.println("Enter side of square:");
        int side = scan.nextInt();
        Rectangle square = new Rectangle(side);
        int area2 = square.area();  
        int perimeter2 = square.perimeter();
        System.out.println("Area of square: " + area2);
        System.out.println("Perimeter of square: " + perimeter2);
        scan.close();
    }
    
}
