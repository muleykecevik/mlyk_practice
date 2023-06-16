package P02_ternary;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
        //“Sayi 5’in tam kati” yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scan.nextInt();

        System.out.println(num%5==0 ? "The number is divisible by 5" : "The number is not divisible by 5");
    }
}
