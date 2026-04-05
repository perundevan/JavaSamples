import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Abstract class
abstract class Employee {

    String name;

    // Constructor
    Employee(String name) {
        this.name = name;
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    void displayName() {
        System.out.println("Employee Name: " + name);
    }

}

// Full-time employee
class FullTimeEmployee extends Employee {

    double monthlySalary;

    FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

// Part-time employee
class PartTimeEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    double calculateSalary(int a) {
        return hoursWorked * hourlyRate;
    }
}

// Main class
public class abstract1 {
    public static void main(String[] args) throws FileNotFoundException {

        Employee e1 = new FullTimeEmployee("Kugan", 50000);
        Employee e2 = new PartTimeEmployee("Arun", 20, 500);

        Employee e3 = null;

        try{

            System.out.println(e3.name);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new ArithmeticException();
        } finally {

        }


        FileReader fr = new FileReader("");

        e1.displayName();
        System.out.println("Salary: " + e1.calculateSalary());

        e2.displayName();
        System.out.println("Salary: " + e2.calculateSalary());
    }
}