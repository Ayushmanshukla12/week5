package week5;

import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {
        try{
            int i=204;
            RandomAccessFile raf =new RandomAccessFile("a.txt","rw");
            raf.seek(0);
            raf.writeInt(67);
            raf.readInt();
        }catch(Exception e){
            e.printStackTrace();

        }
    }
}
