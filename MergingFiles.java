package week5;

import java.io.*;

public class MergingFiles {
    public static void main(String[] args) {
       MergingFiles mergingFiles = new MergingFiles();
        try {
            mergingFiles.mergingtwofilesdata();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    void mergingtwofilesdata() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("m.txt");
        FileInputStream fileInputStream = new FileInputStream("a.txt");
        FileInputStream fileInputStream1 =new FileInputStream("ab.txt");
        SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream,fileInputStream1);
        int i;
        while((i=sequenceInputStream.read())!=-1){
            fileOutputStream.write((char)i);
            System.out.println((char)i);
        }



//            FileOutputStream fileOutputStream1 = new FileOutputStream(" abcde.txt");
//            String message="Hi all,how are you?";
//            byte b[]=message.getBytes();
//            fileOutputStream1.write(b);
//
//            FileOutputStream fileOutputStream2 = new FileOutputStream("ab.txt" );
//            String message1="Hi everyone,how are you all?";
//            byte b1[]=message1.getBytes();
//            fileOutputStream2.write(b1);
//
//            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Coditas\\IdeaProjects\\untitled\\ abcde.txt");
//            FileInputStream fileInputStream1 = new FileInputStream(("C:\\Users\\Coditas\\IdeaProjects\\untitled\\ab.txt"));
//            FileOutputStream fileOutputStream3 = new FileOutputStream("mergedfile.txt",true);
//            SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream,fileInputStream1);
//
//        int i;
//        while((i=sequenceInputStream.read())!=-1){
//            fileOutputStream3.write((char)i);
//        }
//        sequenceInputStream.close();
//        String str="we are fine,what about you?";
//        byte b3[]=str.getBytes();
//        fileOutputStream3.write(b3);
//
//        fileOutputStream1.close();
//        fileOutputStream2.close();
//        fileOutputStream3.close();
//        fileInputStream1.close();
//        fileInputStream.close();
    }
}
