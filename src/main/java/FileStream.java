//
//  EXCLUDED FROM WORK DUE TO SERIALIZATION
//

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileStream {
    File file = new File("src/data.txt");

    public ArrayList<Employee> LoadFromFile() {
        ArrayList<Employee> Employees = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(this.file)){
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
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        return Employees;
    }

//    public SaveToFile(ArrayList<Employee> Employees) {
//
//    }
}
