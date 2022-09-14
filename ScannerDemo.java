package week5;

import java.util.Scanner;

public class ScannerDemo {
//    int id=0;
//    String name;
//    Float percentage;
//    Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
//        ScannerDemo scannerDemo = new ScannerDemo();
//        scannerDemo.accept();
//        scannerDemo.display();
        int sum=0;
        for(String s:args){
            int i=Integer.parseInt(s);
            sum+=i;
        }
        System.out.println(sum);
    }
//    void accept(){
//         id=sc.nextInt();
//         sc.nextLine();
//         name= sc.nextLine();
//         sc.nextLine();
//         percentage=sc.nextFloat();
//        //String subject= sc.nextLine();
//    }
//    void display(){
//        System.out.println("id is: " + id + " name is: " + name + " percentage is: " + percentage );
//    }
}
