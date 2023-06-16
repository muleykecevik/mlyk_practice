package P01_IfElseStatements;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        //Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your exam score : ");
        double input= scan.nextDouble();

        if (input>=50){
            System.out.println("Congrulations! You passed the class.");
        } else {
            System.out.println("Sorry! You failed the class.");
        }
    }
}
