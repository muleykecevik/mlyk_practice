package P01_IfElseStatements;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        //Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        //yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        //olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.


        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your age and your gender (F/M)");
        int age= scan.nextInt();
        char gender=scan.next().charAt(0);

        if (gender=='F' || gender=='f'){
            if (age<18 || age>80){
                System.out.println("Please enter a valid age.");
            } else if (age>=60){
                System.out.println("You can retire.");
            } else {
                System.out.println("You can not retire now. You can retire after " + (60-age) +" years.");
            }
        } else if (gender=='M' || gender=='m'){
            if (age<18 || age>80){
                System.out.println("Please enter a valid age.");
            } else if (age>=65){
                System.out.println("You can retire.");
            } else {
                System.out.println("You can not retire now. You can retire after " + (65-age) +" years.");
            }

        } else {
            System.out.println("Please enter a valid gender.");

        }

    }
}
