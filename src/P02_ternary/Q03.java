package P02_ternary;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        //harf olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a letter : ");
        char input= scan.next().charAt(0);

        System.out.println(input>='a' && input<='z' ? Character.toUpperCase(input) : input);

    }
}
