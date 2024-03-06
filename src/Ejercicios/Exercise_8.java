package Ejercicios;

import java.util.Scanner;
import java.util.Random;
public class Exercise_8 {

    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int NumRandom1 = random.nextInt(10) + 1;
        int NumRandom2 = random.nextInt(10)+ 1;
        int user = 0;


        int Sum = NumRandom1 + NumRandom2;

        System.out.println("What is the addition of " + NumRandom1 + " and " + NumRandom2);

        do {
            System.out.println("Please enter the total: ");
            user = keyboard.nextInt();

            if (user == Sum){
                System.out.println("It is correct!!");
            }else{
                System.out.println("Wrong");
            }
        }while(user != Sum);
    }
}
