import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // index for manipulating records
        int index;
        // Load the existing Employees from the file
        FileStream filestream = new FileStream();
        ArrayList<Employee> Employees = filestream.LoadFromFile();

        //Print the menu
        String MenuString = "\n#1. Add Employee\t#2. View Employees\t#3. Search Employees\t#4. Update Employee\t#5. Delete Employee\t#6. Save and Exit\n>";
        System.out.print("Welcome to the Employee Management System\nChose your action by a number");
        System.out.print(MenuString);

        Scanner scanner = new Scanner(System.in);
        String action = scanner.nextLine();
        while (!action.equals("6")) {
            switch (action) {
                case "1":
                    index = Employees.size() + 1;
                    Employees.add(new Employee(index));
                    break;
                case "2":
                    for (Employee employee : Employees) {
                        System.out.println(employee);
                    }
                    break;
                case "3":
                    Search.SearchEmployee(Employees);
                    break;
                case "4":
                    break;
                case "5":
                    System.out.println("Enter Employee ID");
                    index = Integer.parseInt(scanner.nextLine());
                    Employees.remove(index - 1);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.print(MenuString);
            action = scanner.nextLine();
        }

    }
}
