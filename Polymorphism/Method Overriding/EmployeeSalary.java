abstract class Employee
{
    String name;
    int basicSalary;
    abstract double calculateSalary();
    abstract void display();
    public Employee(String name, int basicSalary) 
    {
        this.name = name;
        this.basicSalary = basicSalary;
    }
    
}
class PermanentEmployee extends  Employee
{
    PermanentEmployee(String name, int basicSalary)
    {
        super(name, basicSalary);
    }
    @Override
    void display()
    {
        System.out.println("the name of the permanent employee"+name);
        System.out.println("the salary of permanent employee before adding bonus"+basicSalary);
    }
    @Override
    double calculateSalary()
    {
        return  basicSalary+(basicSalary * 0.20);
    }

}
class ContractEmployee extends Employee
{

    public ContractEmployee(String name, int basicSalary) 
    {
        super(name, basicSalary);
    }
    @Override
    double calculateSalary()
    {
        return basicSalary+(basicSalary*0.10);
    }
    @Override
     void display()
    {
        System.out.println("the name of the Contract employee"+name);
        System.out.println("the salary of Contract employee before adding bonus"+basicSalary);
    }
    
}
public class EmployeeSalary
{
    public static void main(String[] args) 
    {
        Employee obj1 = new PermanentEmployee("harsha", 7000);
        System.out.println("***********************************************");
        obj1.display();
        double perman = obj1.calculateSalary();
        System.out.println("the bonus is add to salary now the salary is"+perman);
        System.out.println("************************************************");
        Employee obj2 = new ContractEmployee("mani", 7000);
        System.out.println("*************************************************");
        obj2.display();
        double Contract = obj2.calculateSalary();
        System.out.println("the bonus is add to salary now the salary is"+Contract);
        
    }
}