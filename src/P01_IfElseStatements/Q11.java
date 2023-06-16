package P01_IfElseStatements;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        //Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the number of products.");
        int product= scan.nextInt();
        System.out.println("Please enter price of the products");
        double price= scan.nextDouble();
        System.out.println("Do you have a member card? Yes/No");
        String card= scan.next();

        if (card.equalsIgnoreCase("Yes")){
            if (product>10){
                System.out.println("Price with %20 discount is : " +(price*0.80)*product);
            } else {
                System.out.println("Price with %15 discount is : " +(price*0.85)*product);
            }
        } else if (card.equalsIgnoreCase("No")) {
            if (product > 10) {
                System.out.println("Price with %15 discount is : " +(price*0.85)*product);
            } else {
                System.out.println("Price with %10 discount is : " +(price*0.90)*product);
            }
        } else {
            System.out.println("Please enter a valid answer");
        }


    }
}
