class NoConstructor {
    int a; 
    String name;
    double d;
}
public class Default {

    public static void main(String[] args) {
        NoConstructor n1 = new NoConstructor();
        NoConstructor n2 = new NoConstructor();
        System.out.println("n1.a = "+n1.a);
        System.out.println("n1.name = "+n1.name);
        System.out.println("n1.d = "+n1.d);   
        System.out.println("n2.a = "+n2.a);  
        System.out.println("n2.name = "+n2.name);
        System.out.println("n2.d = "+n2.d);
    }
}