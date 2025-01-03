import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;

    //Constructors
    public Employee(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public Employee(int index) {
        Scanner scanner = new Scanner(System.in);
        this.id = index;

        System.out.print("Enter employee name: ");
        this.name = scanner.nextLine();

        while(true){
            System.out.print("Enter employee age: ");
            if (scanner.hasNextInt()) {
                this.age = scanner.nextInt();
                break;
            } else {
                System.err.print("Invalid input! Please enter a valid integer\n");
                scanner.next();
            }
        }

        System.out.print("Enter employee department: ");
        this.department = scanner.next();

        while(true){
            System.out.print("Enter employee salary: $");
            if (scanner.hasNextDouble()) {
                this.salary = scanner.nextDouble();
                break;
            } else {
                System.err.print("Invalid input! Please enter a valid double number\n");
                scanner.next();
            }
        }
    }

    //Getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Methods
    @Override
    public String toString(){
        return (String.format("%-5d %-20s %-5d %-12s %-10.2f", id, name, age, department, salary));
    }
}