package week5;

 import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.lang.Object;

public class FIleHandlingClassesDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream =new FileOutputStream("z1.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeInt(77);


        FileInputStream fileInputStream = new FileInputStream("z1.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        dataInputStream.readInt();
    }
}



        /*example of buffered input/output stream
        FileInputStream fileInputStream=new FileInputStream("a.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream("b.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        FileOutputStream fileOutputStream1 = new FileOutputStream("c.txt");
        BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(fileOutputStream1);
//        String str=JOptionPane.showInputDialog(null,"enter the string");
//        byte b[]=str.getBytes();
//        bufferedOutputStream.write(b);
         int i;
         while((i=bufferedInputStream.read())!=-1){
             bufferedOutputStream.write((char)i);
             bufferedOutputStream1.write((char)i);
             System.out.print((char)i);
         }
         bufferedOutputStream.close();
         bufferedInputStream.close();
*/


        /*example of bytearray input/output stream
//        ByteArrayOutputStream byteArrayOutputStream =new ByteArrayOutputStream();
//        FileOutputStream fileOutputStream = new FileOutputStream("abcd.txt");
//        FileOutputStream fileOutputStream1=new FileOutputStream("z.txt");
//        FileOutputStream fileOutputStream2=new FileOutputStream("A.txt");
//
////        String message="Hi all,how are you";
//        String message= JOptionPane.showInputDialog(null,"enter the input");//swing class fn to input data from the user
//        byte b[]=message.getBytes();
//        byteArrayOutputStream.write(b);
//        byteArrayOutputStream.writeTo(fileOutputStream);
//        byteArrayOutputStream.writeTo(fileOutputStream1);
//        byteArrayOutputStream.writeTo(fileOutputStream2);
//        fileOutputStream.close();
//        System.out.println("writing done in the file");
//
//        System.out.println("**********************************");
//
//        byte buf[] = byteArrayOutputStream.toByteArray();
//        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buf);
//
//        int j;
//        while((j=byteArrayInputStream.read())!=-1){
//            //System.out.print((char)j);
//            byteArrayOutputStream.write((char)j);
//        }
//        FileInputStream fileInputStream=new FileInputStream("abcd.txt");
//        FileInputStream fileInputStream1=new FileInputStream("z.txt");
//        FileInputStream fileInputStream2=new FileInputStream("A.txt");
//
//        //byte b1[]=message.getBytes();
//        int k ;
//        while((k=fileInputStream.read())!=-1){
//            //fileOutputStream.write (fileInputStream.read());
//            System.out.print((char)k);
//
//        }
//
//        fileInputStream.close();

*/

