package Ejercicios;

import java.util.Scanner;
public class Exercise_7 {

    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        int Number1;
        int Number2;
        int Number3;

        System.out.println("Please enter a number : ");
        Number1 = keyboard.nextInt();

        System.out.println("Please enter a number : ");
        Number2 = keyboard.nextInt();

        System.out.println("Please enter a number : ");
        Number3 = keyboard.nextInt();

        if ((Number1 < Number2) && (Number2 < Number3)) {
            System.out.println("The numbers in order will be: " + Number1 + Number2 + Number3);
        } else if ((Number1 < Number3) && (Number3 < Number2)) {
            System.out.println("The numbers in order will be: " + Number1 + Number3 + Number2);
        } else if ((Number2 < Number1) && (Number1 > Number3)) {
            System.out.println("The numbers in order will be: " + Number2 + Number1 + Number3);
        } else if ((Number2 < Number3) && (Number3 < Number1)) {
            System.out.println("The numbers in order will be: " + Number2 + Number3 + Number1);
        } else if ((Number3 < Number1) && (Number1 < Number2)) {
            System.out.println("The numbers in order will be: " + Number3 + Number1 + Number2);
        }else {
            System.out.println("The numbers in order will be: " + Number3 + Number2 + Number1);
        }
    }
}
