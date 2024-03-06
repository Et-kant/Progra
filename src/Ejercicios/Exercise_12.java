package Ejercicios;

import java.util.Scanner;
public class Exercise_12 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int [] Array1 = new int[4];
        int product = 1;

        for (int i = 0; i < Array1.length; i++) {
            System.out.println("Please enter the number you prefer: ");
            Array1[i] = keyboard.nextInt();
        }

        for (int j = 0; j < Array1.length; j++) {
            if ((Array1[j] % 2) == 0){
                product *= Array1[j];
                System.out.println("The numbers are that even are: " + Array1[j]);
            }
        }

        System.out.println("The total will be: " + product);
    }
}
