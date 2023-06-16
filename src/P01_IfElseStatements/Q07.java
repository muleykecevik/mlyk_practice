package P01_IfElseStatements;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        // - Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf
        //olup olmadigini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a letter : ");
        char input= scan.next().charAt(0);

        if (input>='A'&& input<='Z'){
            System.out.println("The entered letter is uppercase.");
        } else {
            System.out.println("The entered letter is not uppercase.");
        }

    }
}
