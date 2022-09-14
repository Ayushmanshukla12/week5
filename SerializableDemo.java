package week5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee(1,"coditas", 96);
        FileOutputStream fileOutputStream = new FileOutputStream("Serialization.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(employee);
        System.out.println("serilization done");
    }
}
