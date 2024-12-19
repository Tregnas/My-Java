import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> Employees = new ArrayList<>();

        // Loading existing DB from the file
        File file = new File("src/data.txt");
        try (Scanner fileScanner = new Scanner(file)){
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(":");
                if (data.length == 5) {
                    int id = Integer.parseInt(data[0]);
                    String name = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    String department = data[3].trim();
                    double salary = Double.parseDouble(data[4].trim());
                    Employee employee = new Employee(id, name, age, department, salary);
                    Employees.add(employee);
                } else {
                    System.out.println("Invalid line, please check\n" + line);
                }
            }
            fileScanner.close();  // Close the file scanner after use

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        for (Employee employee : Employees) {
            System.out.println(employee);
        }
    }
}
