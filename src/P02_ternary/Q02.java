package P02_ternary;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        //Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        //“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Input 3 number : ");
        int input1= scan.nextInt();
        int input2= scan.nextInt();
        int input3= scan.nextInt();

        System.out.println(input1==input2 && input2==input3 && input1!=0 ? "Equilateral triangle" : "Not equilateral triangle");





    }
}
