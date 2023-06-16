package P02_ternary;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your exam score : ");
        double input= scan.nextDouble();

        System.out.println((input>=50) ? "Congrulations! You passed the class." : "Sorry! You failed the class.");

    }
}
