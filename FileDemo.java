package week5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("abcd.txt");
        fileOutputStream.write(65);

        String message="Hi all,how are you";
        byte b[]=message.getBytes();
        fileOutputStream.write(b);

        System.out.println("writing done in the file");

        System.out.println("**********************************");

        FileInputStream fileInputStream=new FileInputStream("abcd.txt");
        //byte b1[]=message.getBytes();
        int k ;
        while((k=fileInputStream.read())!=-1){
            //fileOutputStream.write (fileInputStream.read());
            System.out.print((char)k);

        }
        fileOutputStream.close();
        fileInputStream.close();


//        File file = new File("abc.txt");

//        if(file.exists()){
//            System.out.println("file exists: " + file.getName());
//        }
//        else {
//            System.out.println("file does not exists,lets create a file");
//            file.createNewFile();
//            System.out.println();
//
//        }
    }
}
