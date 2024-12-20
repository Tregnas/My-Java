import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static void SearchEmployee(ArrayList<Employee> Employees) {
        int action;
        System.out.print("\n#1. By ID\t#2. By name\t#3. By age\t#4. by department\t#5. By salary\n>");

        Scanner scanner = new Scanner(System.in);
        while(true) {
            if (scanner.hasNextInt()) {
                action = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input! Please enter a valid integer.");
                scanner.next();
            }
        }

        switch (action){
            case 1:
                System.out.print("Enter search ID: \n>");
                int id = scanner.nextInt();
                for (Employee employee : Employees) {
                    if ( employee.id == id) {
                        System.out.println(employee);
                    }
                }
                break;
            case 2:
                System.out.print("Enter search name: \n>");
                break;
            case 3:
                System.out.print("Enter search age: \n>");
                break;
            case 4:
                System.out.print("Enter search Department: \n>");
                break;
            case 5:
                System.out.print("Enter search Salary: \n>");
                break;
        }
    }
}
