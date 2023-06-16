package P01_IfElseStatements;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        //Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
        //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
        //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
        //zamani” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name of day");
        String day = scan.next();

        if (day.equalsIgnoreCase("Monday")) {
            System.out.println("Working time! You have 5 days for weekend.");
        } else if (day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Working time! You have 4 days for weekend.");
        } else if (day.equalsIgnoreCase("Wednesday")) {
            System.out.println("Working time! You have 3 days for weekend.");
        } else if (day.equalsIgnoreCase("Thursday")){
            System.out.println("Working time! You have 2 days for weekend.");
        }else if (day.equalsIgnoreCase("Friday")) {
            System.out.println("Working time! You have 1 days for weekend.");
        } else if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("Weekend time!");
        } else if (day.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend time!");
        }
    }
}
