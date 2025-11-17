class Area
{
    Area(int side)
    {
        int area;
        area = side*side;
        System.out.println("area of square is"+area);
    }
    Area(int length , int breadth)
    {
        int area;
        area = length * breadth;
        System.out.println("area of the rectangle"+area);
    }
    Area(double r) 
    {
        double radius;
        radius = Math.PI*r*r;
        System.out.println("radius of the circle"+radius);
    }
    

}
public class TestArea 
{
    public static void main(String[] args) 
    {
        new Area(4);
        new Area(4, 5);
        new Area(4);       
    }
}
