abstract class Shape
{
    abstract int area();
}
class Rectangle extends Shape
{
    int length;
    int breadth;

    public Rectangle(int l, int b)
    {
        this.length = l;
        this.breadth = b;
    }
    int area()
    {
        return length*breadth;
    }
    
}
class Circle extends Shape
{
    double radius;
    public Circle(double  r)
    {
        this.radius = r;
    }
    @Override
    int  area()
    {
        return (int) (Math.PI*Math.pow(radius, 2));
    }
}
public class CalShape 
{
    public static void main(String[] args) 
    {
        Shape [] s = new Shape[2];
        s[0] = new Rectangle(4, 5);
        s[1] = new Circle(5);
        for (Shape shape : s) 
        {
            System.out.println();
            shape.area();
            
        }
    }
}
