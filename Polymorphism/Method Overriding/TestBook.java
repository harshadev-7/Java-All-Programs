abstract class Book
{
    String title;
    int price;
    int yearofPublication;
   abstract  double getFinalPrice();
   abstract void display();

    public Book(String t, int p, int yearofPublication) 
    {
         title = t;
        price = p;
        this.yearofPublication = yearofPublication;
        
    }
}
class OldBook extends Book
{
    public OldBook(String t, int p , int yearofPublication)
    {
        super(t,p,yearofPublication);
    }
    double getFinalPrice()
    {
      double dis = 0;
      int a = 2025 - yearofPublication;
      if(a== 1)
      {
        dis = 0.10;
      }
      else if(a == 2)
      {
        dis = 0.20;
      }
      else if(a > 3)
      {
        dis = 0.30;
      }
        return price - (price * dis);
    }
    void display()
    {
      System.out.println("the title of the book is"+title);
      System.out.println("the original price of the book is"+price);
      System.out.println("The yearofpublication"+yearofPublication);
    }
    
}
class NewBook extends Book 
{
    public NewBook(String t, int p , int yearofPublication)
    {
        super(t, p, yearofPublication);
    }
    double getFinalPrice()
    {
        // discount is not there for new book
        return price;
    }
    void display()
    {
       System.out.println("the title of the newbook is"+title);
      System.out.println("the original price of the newbook is"+price);
      System.out.println("The yearofpublication of newbook"+yearofPublication);

    }

}
public class TestBook
{
    public static void main(String[] args) 
    {
      Book obj1 = new OldBook("Independencesday", 500, 1);
      System.out.println("*********************************************************");
      obj1.display();
      double a = obj1.getFinalPrice();
      System.out.println("the discount add to price now the price is"+a);
      System.out.println("*********************************************************");
      Book obj3 = new OldBook("Independencesday", 500, 3);
      System.out.println("**********************************************************");
      obj3.display();
      double b= obj3.getFinalPrice();
      System.out.println("the discount add to price now the price is"+b);
      System.out.println("*************************************************************");
      Book obj2 = new NewBook("independencesday", 1000, 0);
      obj2.display();
      double c= obj1.getFinalPrice();
      System.out.println("the discount add to price now the price is"+c);
    }
}