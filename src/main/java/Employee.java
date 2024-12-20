import java.util.Scanner;

public class Employee {
    int id;
    String name;
    int age;
    String department;
    double salary;

    Employee(int id, String name, int age, String department, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    Employee(int index) {
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

    @Override
    public String toString(){
        return "#" + this.id + "\t\tName: " + this.name + "\t"+ "\tAge: " + this.age + "\t\tDepartment: " + this.department + "\t" + "\t\tSalary: " + this.salary;
    }

//    public Employee addNewEmployee(){
//        return new Employee();
//    }
}
