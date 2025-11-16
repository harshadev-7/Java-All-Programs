class Constructor
{
    String name;
    int age;

    public Constructor() {
        this("harsha",18);
    }
    public Constructor(String name , int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(name+" --"+age);
    }   
}



public class Callingconstructor {
    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor("Alice", 25);
        obj1.display();
        obj2.display();
    }
}
    
