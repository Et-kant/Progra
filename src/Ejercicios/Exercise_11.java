package Ejercicios;

import java.util.Scanner;

public class Exercise_11 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int [] array1 = new int[4];
        int sum = 0;

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Please enter a number: ");
            array1[i] = keyboard.nextInt();
        }

        for (int j = 0; j < array1.length; j++) {
            sum += array1[j];
        }
        System.out.println("The total will be: " + sum);
    }
}
