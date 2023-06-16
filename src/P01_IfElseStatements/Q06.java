package P01_IfElseStatements;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.


        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your age");
        int input= scan.nextInt();

        if (input<18 || input>80){
            System.out.println("Please enter a valid age.");
        }else if (input>=65){
            System.out.println("You can retire.");
        } else if (input<65){
            System.out.println("You can not retire now. You can retire after " + (65-input) +" years.");
        }
    }
}
