class test{
    String name;
    int age;

    public test() {
        age = 18;
        name = "harsha";
    }

    public test(String name , int age){
this.name=name;
this.age=age;
    }

}

public class Constructor {
    public static void main(String[] args) {
        test t1 = new test();
        test t2 = new test("harsha", 18);
        System.out.println(t1.name+ " _ "+t1.age);
        System.out.println(t2.name+" - "+t2.age);
    
}
}