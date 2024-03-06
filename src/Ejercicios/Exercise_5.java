package Ejercicios;

import java.util.Scanner;
public class Exercise_5 {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int Number;
        int sum = 0;

        System.out.println("Please enter the a positive number: ");
        Number = keyboard.nextInt();

        while(Number != 0){
            sum = sum + (Number % 10);
            Number = Number / 10;
        }

        System.out.println("The result of the addition is: " + sum);


    }
}
