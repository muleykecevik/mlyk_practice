package P01_IfElseStatements;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        //olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a letter : ");
        char input= scan.next().charAt(0);

        if (input>='a' && input<='z'){

            System.out.println(Character.toUpperCase(input));
        } else {
            System.out.println(input);
        }

    }
}
