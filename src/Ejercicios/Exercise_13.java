package Ejercicios;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Exercise_13 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int [] Array1 = new int[4];
        int big = Array1[0];

        for (int i = 0; i < Array1.length; i++) {
            System.out.println("Please enter the values for the Array: ");
            Array1[i] = keyboard.nextInt();
        }

        for (int j = 0; j < Array1.length; j++) {
            if (Array1[j] > big){
                big = Array1[j];
            }
        }

        System.out.println("The bigger number will be: " + big);
    }
}
