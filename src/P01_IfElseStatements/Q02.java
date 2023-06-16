package P01_IfElseStatements;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        //- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a letter : ");
        char input= scan.next().charAt(0);

        if (input=='J'|| input=='j'){
            System.out.println("January,June or July");

        } else if (input=='F'|| input=='f') {
            System.out.println("February");

        } else if (input=='M'|| input=='m') {
            System.out.println("March or May");

        } else if (input=='A'|| input=='a') {
            System.out.println("April or August");

        } else if (input=='S'|| input=='s') {
            System.out.println("September");

        } else if (input=='O'|| input=='o') {
            System.out.println("October");

        } else if (input=='N'|| input=='n') {
            System.out.println("November");

        } else if (input=='D'|| input=='d') {
            System.out.println("December");

        }
    }
}
