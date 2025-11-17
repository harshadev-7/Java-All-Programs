class Order {

    void display(int a, String b) {
        System.out.println("int, String method called");
    }

    void display(String a, int b) {
        System.out.println("String, int method called");
    }

    public static void main(String[] args) {
        Order obj = new Order();
        obj.display(10, "Java");
        obj.display("Buddy", 20);
    }
}
