package P01_IfElseStatements;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin, sayi 3 ile bolunuyorsa ”Uc ile bolunebilen
        //sayi”, 5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Input number : ");
        int input= scan.nextInt();

        if (input%3==0 && input%5==0){
            System.out.println("The number is divisible by 3 and 5");
        } else if (input%3==0) {
            System.out.println("The number is divisible by 3");
        } else if (input%5==0) {
            System.out.println("The number is divisible by 5");
        }
    }
}
