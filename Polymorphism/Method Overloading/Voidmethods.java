public class Voidmethods {
    public static void main(String[] args) {
        System.out.println("Main method with String[] args called");

        // Calling overloaded main methods
        main(10);
        main("Hello, Java!");
        main(5, "Overloading Example");
    }

    // Overloaded main method with int parameter
    public static void main(int num) {
        System.out.println("Overloaded main method with int: " + num);
    }

    // Overloaded main method with String parameter
    public static void main(String arg) {
        System.out.println("Overloaded main method with String: " + arg);
    }

    // Overloaded main method with int and String parameters
    public static void main(int num, String str) {
        System.out.println("Overloaded main method with int and String: " + num + ", " + str);
    }
}

