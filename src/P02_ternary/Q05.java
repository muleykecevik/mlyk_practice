package P02_ternary;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Input 2 number : ");
        int input1= scan.nextInt();
        int input2= scan.nextInt();

        System.out.println(input1>input2 ? input2 : input1);


    }
}
