import java.io.*;
import java.util.ArrayList;

public class FileSerializable {
    public FileSerializable() {
    }

    public static ArrayList<Employee> DeSerialize() throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("data.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            employees = (ArrayList<Employee>) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.getException();
        }
        return employees;
    }

    public static void SerializableOutput(ArrayList<Employee> Employees) throws IOException {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("data.bin"));
            objectOutputStream.writeObject(Employees);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
