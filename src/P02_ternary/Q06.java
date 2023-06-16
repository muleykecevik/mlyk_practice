package P02_ternary;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scan.nextInt();

        System.out.println(num>0 ? num : num*-1);
    }
}
