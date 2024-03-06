package Ejercicios;

import java.util.Scanner;
public class Exercise_6 {

    public static void main (String[] args){
        Scanner keyboard =  new Scanner(System.in);
        int Number;
        int cont = 0;

        System.out.print("Please enter a number: ");
        Number = keyboard.nextInt();

        for (int i = 0; i < Number; i++) {
            System.out.print("\n");
            cont++;
            for(int j = 0; j < cont; j++) {
                System.out.print("*");
            }
        }


    }
}
