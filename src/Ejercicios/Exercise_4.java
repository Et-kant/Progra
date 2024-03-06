package Ejercicios;

import java.awt.desktop.UserSessionEvent;
import java.util.Scanner;

public class Exercise_4 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        double UserInvestment;
        int AnualInterests;
        int Year;

        System.out.println("Please enter the amount of your INVESTMENT");
        UserInvestment = keyboard.nextInt();

        System.out.println("Please enter the Anual Interests: ");
        AnualInterests = keyboard.nextInt();

        System.out.println("Please enter the amount of YEARS for the Investment: ");
        Year = keyboard.nextInt();

        for (int i = 0; i < Year; i++) {
            UserInvestment = ((UserInvestment * AnualInterests) / 100) + UserInvestment;

        }

        System.out.println("The total revenue of the Investment was: ");
        System.out.println("For a period of " + Year + " Years: " + String.format("%.2f", UserInvestment));
    }
}
