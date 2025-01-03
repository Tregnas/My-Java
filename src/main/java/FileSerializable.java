import java.io.*;
import java.util.ArrayList;

public class FileSerializable {
    File file = new File("src/data.txt");
    public FileSerializable() {
    }

    public static <employees> ArrayList<Employee> DeSerialize() throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("data.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            employees = (ArrayList<Employee>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public static void SerializableOutput(ArrayList<Employee> Employees) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data.bin"));
            objectOutputStream.writeObject(Employees);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
