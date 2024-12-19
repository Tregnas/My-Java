import java.util.Scanner;

public class Employee {
    int id;
    String name;
    int age;
    String department;
    double salary;

    @Override
    public String toString(){
        return "Employee: #" + this.id + " \nName: " + this.name + " \nAge: " + this.age + " \nDepartment: " + this.department + " \nSalary: " + this.salary;
    }

    Employee() {
        Scanner scanner = new Scanner(System.in);
        this.id = 0;

        System.out.print("Enter employee name: ");
        this.name = scanner.next();

        while(true){
            System.out.print("Enter employee age: ");
            if (scanner.hasNextInt()) {
                this.age = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
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
                    System.out.println("Invalid input! Please enter a valid double number. ");
                    scanner.next();
                }
        }
        scanner.close();
    }
}
