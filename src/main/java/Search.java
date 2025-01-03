import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static void SearchEmployee(ArrayList<Employee> Employees) {
        int action;
        int foundCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n1|By ID\t 2|By name\t 3|By department\t 4|By salary\n>");

        while(true) {
            if (scanner.hasNextInt()) {
                action = scanner.nextInt();
                break;
            } else {
                System.out.print("Invalid input! Please enter a valid integer\n");
                scanner.next();
            }
        }

        switch (action){
            default:
                System.err.print("Your input is invalid\n");
                break;
            case 1:
                System.out.print("Enter search ID: \n>");
                int id = scanner.nextInt();
                for (Employee employee : Employees) {
                    if ( employee.getId() == id) {
                        System.out.println(employee);
                    }
                }
                break;
            case 2:
                System.out.print("Enter search name: \n>");
                String searchName = scanner.next();
                foundCount = 0;
                System.out.printf("%-5s %-20s %-5s %-12s %-10s\n", "ID", "Name", "Age", "Department", "Salary");
                System.out.println("--------------------------------------------------------------");
                for (Employee employee : Employees) {
                    if (employee.getName().contains(searchName)) {
                        System.out.println(employee);
                        foundCount++;
                    }
                }
                System.out.println("--------------------------------------------------------------");
                System.out.println(foundCount + " records found");
                break;
            case 3:
                System.out.print("Enter search Department: \n>");
                String searchDepartment = scanner.next();
                foundCount = 0;
                System.out.printf("%-5s %-20s %-5s %-12s %-10s\n", "ID", "Name", "Age", "Department", "Salary");
                System.out.println("--------------------------------------------------------------");
                for (Employee employee : Employees) {
                    if (employee.getDepartment().contains(searchDepartment)) {
                        System.out.println(employee);
                        foundCount++;
                    }
                }
                System.out.println("--------------------------------------------------------------");
                System.out.println(foundCount + " records found");
                break;
            case 4:
                System.out.print("Enter lowest limit of a Salary: \n>");
                double searchSalary;
                foundCount = 0;

                while(true) {
                    if (scanner.hasNextDouble()) {
                        searchSalary = scanner.nextDouble();
                        break;
                    } else {
                        System.err.print("Invalid input! Please enter a number\n");
                        System.err.flush();
                        scanner.next();
                    }
                }
                System.out.printf("%-5s %-20s %-5s %-12s %-10s\n", "ID", "Name", "Age", "Department", "Salary");
                System.out.println("--------------------------------------------------------------");
                for (Employee employee : Employees) {
                    if (employee.getSalary() >= searchSalary) {
                        System.out.println(employee);
                        foundCount++;
                    }
                }
                System.out.println("--------------------------------------------------------------");
                System.out.println(foundCount + " records found");
                break;
        }
    }
}
