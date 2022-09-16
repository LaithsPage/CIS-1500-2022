package chapter2;

import java.util.Scanner;

public class chapter2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.printl5n("Please enter the value of a triangle leg");


        double userLegA = Double.parseDouble(keyboard.nextLine());

        System.out.println("Please enter the value of the other triangle leg");

        double userLegB = Double.parseDouble(keyboard.nextLine());

        double triangleArea = ((userLegA * userLegB) / 2);

       System.out.println("Your result = " + triangleArea);

    }

}
