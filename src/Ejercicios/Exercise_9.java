package Ejercicios;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercise_9 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int number1;
        int number2;
        int MCD = 1;

        System.out.println("Please enter a number: ");
        number1 = keyboard.nextInt();
        System.out.println("Please enter another number: ");
        number2 = keyboard.nextInt();

        for (int i = 1; i <= number1 && i <= number2; i++){
            if(number1 % i == 0 && number2 % i == 0){
                MCD = i;
            }
        }

        System.out.println("The result of " + number1 + " and " + number2 + " Will be " + MCD);

    }
}
