package P01_IfElseStatements;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        //Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin.
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the distance.");
        int distance= scan.nextInt();
        System.out.println("Please enter metric unit of measurement that you request");
        String unit= scan.next();
        if (unit.equalsIgnoreCase("m")){
            distance*=1000;
            System.out.println(distance+unit);
        } else if (unit.equalsIgnoreCase("cm")) {
            distance*=10000;
            System.out.println(distance+unit);
        } else {
            System.out.println("The unit you requested is not registered in the system");
        }


    }
}
