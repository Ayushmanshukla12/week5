package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
      String name;
      int id=0;
      float percentage;

        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter the id of the student");
        id=Integer.parseInt(bufferedReader.readLine());

        System.out.println("enter the name of the student");
        name=bufferedReader.readLine();

        System.out.println("enter the percentage of the student");
        percentage=Float.parseFloat(bufferedReader.readLine());

        System.out.println("Student id is: " + id + " with name " + name + " and percentage " + percentage);
    }
}
