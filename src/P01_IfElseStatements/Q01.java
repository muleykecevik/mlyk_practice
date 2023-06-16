package P01_IfElseStatements;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Input number : ");
        int input= scan.nextInt();

        if (input%5==0){
            System.out.println("The number is divisible by 5");
        }
    }
}
