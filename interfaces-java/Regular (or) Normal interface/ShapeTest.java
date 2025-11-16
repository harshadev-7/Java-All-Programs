interface Shape
{
	int area();
	int per();
}
class Rectangle implements Shape
{
int length;
int breadth;
    public Rectangle(int l, int b) {
		length = l;
		breadth = b;	
    }
	
	public int area()
	{
         return length*breadth;
	}
	public int per()
	{
		return 2*(length+breadth);
	}
}

class Cuboid implements Shape
{
	int length;
	int breadth;
	int height;
	public Cuboid(int l,int b,int h)
	{
		length =l;
		breadth = b;
		height = h;
	}
	public int area()
	{
		return length*breadth*height;
	}
	public int per()
	{
		return 4*(length*breadth*height);
	}
}
public class ShapeTest
{
	public static void main(String[] args)
	{
		Shape shape = new Rectangle(2,4);
		Shape mycar = new Cuboid(2,4,5);
		
		
			System.out.println("AREA:"+shape.area());
	                System.out.println("AREA:"+mycar.area());
			System.out.println("per of rect"+shape.area()+" per of cuboid "+mycar.per());
	}
}