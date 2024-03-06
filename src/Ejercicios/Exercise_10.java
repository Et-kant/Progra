package Ejercicios;

import java.util.Scanner;
public class Exercise_10 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int num1;
        int rep;
        int Digit;
        int cont = 0;

        System.out.println("Please enter a positive number: ");
        num1 = keyboard.nextInt();

        System.out.println("Please enter a digit to compare if it is repeating: ");
        rep = keyboard.nextInt();

        while(num1 != 0){
            Digit = num1 % 10;
            if (Digit == rep){
                cont++;
            }
            num1 = num1 / 10;
        }

        if (cont > 1){
            System.out.println("The number was repeated " + cont + " Times");
        }else {
            System.out.println("The number did not repeat. ");
        }
    }
}
