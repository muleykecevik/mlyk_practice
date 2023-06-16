package P01_IfElseStatements;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin sayi tek ise negatif veya pozitif tek sayi
        //oldugunu yazdirin, sayi cift sayi ise 10’un tam kati olup olmadigini
        // yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scan.nextInt();

        if (num%2==1 || num%2==-1){
            if (num>=0){
                System.out.println("The number is positive");
            } else if (num<0){
                System.out.println("The number is negative");

            }

        } else if (num%2==0){
            if (num%10==0){
                System.out.println("The number is divisible by 10");
            } else if (num%10!=0) {
                System.out.println("The number is not divisible by 10");
            }
        }
    }
}
