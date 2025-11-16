// Superclass
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass
class Student extends Person {
    int studentId;

    void displayStudentInfo() {
        displayInfo(); // Call method from superclass
        System.out.println("Student ID: " + studentId);
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Harsha";
        s.age = 20;
        s.studentId = 101;
        s.displayStudentInfo();
    }
}