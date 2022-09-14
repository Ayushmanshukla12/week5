package week5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserilizationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("Serialization.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Employee employee = (Employee) objectInputStream.readObject();
        System.out.println(employee);
        System.out.println(("***********************"));

    }
}
