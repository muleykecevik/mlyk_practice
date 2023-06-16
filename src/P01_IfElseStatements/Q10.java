package P01_IfElseStatements;

import javax.swing.plaf.basic.BasicMenuItemUI;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your weight(kg)");
        int weight= scan.nextInt();
        System.out.println("Please enter your height(cm)");
        int height= scan.nextInt();

        int bmi=weight*10000/(height*height);

        if (bmi>=30){
            System.out.println("BMI : "+ bmi +" Obese");
        } else if (bmi>=25 && bmi<30) {
            System.out.println("BMI : " + bmi+ " Overweight");
        } else if (bmi>=20 && bmi<25) {
            System.out.println("BMI : " + bmi+ " Normal");
        } else if (bmi<20) {
            System.out.println("BMI : " + bmi+ " Thin");
        } else{
            System.out.println("Please enter valid information");
        }


    }
}
