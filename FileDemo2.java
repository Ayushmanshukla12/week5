package week5;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {

        File file = new File("abc.txt");

        if(file.exists()){
            System.out.println("file exists: " + file.getName());
        }
        else {
            System.out.println("file does not exists,lets create a file");
            file.createNewFile();
            System.out.println();

        }
    }
}
