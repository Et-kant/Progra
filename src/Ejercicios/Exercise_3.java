package Ejercicios;

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int user;
        int amount;
        double EuroExchangeRate = 0.92;
        double DolarExchangeRate = 1.08;

        System.out.println(" 1. EURO" + " 2. DOLAR");
        System.out.println("Ingrese que moneda posee: ");

        amount = keyboard.nextInt();

        switch(amount){
            case 1:
                System.out.println("You chose EUROS -> DOLARS");
                System.out.println("Please enter the amount of EUROS you have: ");
                user = keyboard.nextInt();
                System.out.println("You have a total of: " + String.format("%.2f", user * DolarExchangeRate) + " DOLARS");
                break;

            case 2:
                System.out.println("You chose DOLARS -> EUROS");
                System.out.println("Please enter the amount of DOLARS you have: ");
                user = keyboard.nextInt();
                System.out.println("You have a total of: " + String.format("%.2f", user * EuroExchangeRate) + " EUROS");
                break;
        }

    }

}
