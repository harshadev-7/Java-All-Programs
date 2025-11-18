abstract  class Vehicle
{
    String model;
    int baseMileage;
    abstract int getmileage();
    abstract void display();
    public Vehicle(String model, int baseMileage)
    {
        this.model = model;
        this.baseMileage = baseMileage;
    }
    
}
class car extends Vehicle
{

    public car(String model, int baseMileage) 
    {
        super(model,baseMileage);
    }
    void display()
    {
        System.out.println("the model"+model);
        System.out.println("the basemileage"+baseMileage);
    }
    int getmileage()
    {
        return baseMileage-2;
    }
}
class Bike extends Vehicle
{

    public Bike(String m, int baseMileage) 
    {
        super(m,baseMileage);
    }
    int getmileage()
    {
        return baseMileage+5;
    }
    void display()
    {
        System.out.println("the model"+model);
        System.out.println("the basemileage"+baseMileage);
    }    
}
public class Mileage
{
    public static void main(String[] args) 
    {
        Vehicle obj1 = new car("sedan", 18);
        System.out.println("**********************************");
        obj1.display();
        int Mileagecar = obj1.getmileage();
        System.out.println("the mileage of the car is"+Mileagecar);
        System.out.println("***********************************");
        Vehicle obj2 = new Bike("Sports", 64);
        obj2.display();
        int MileageBike = obj2.getmileage();
        System.out.println("the mileage of the bike is"+MileageBike);       
    }
}