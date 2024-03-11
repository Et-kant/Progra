package Ejercicios;

import java.util.Scanner;

public class Exercise_1 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int Year;

        System.out.println("Please enter the year: ");
        Year = keyboard.nextInt();

        boolean LeapYear = false;
        if (Year % 4 == 0){
            if (Year % 100 != 0 || Year % 400 == 0){
                LeapYear = true;
            }
        }

        if (LeapYear){
            System.out.println(Year + " This will be a leap year");
        }else{
            System.out.println(Year + " This is not a leap year");
        }
    }
}
