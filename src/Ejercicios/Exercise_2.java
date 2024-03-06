package Ejercicios;

import java.util.Scanner;
import java.util.Random;


public class Exercise_2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int player;

        int machine = random.nextInt(3) + 1;

        System.out.println("Please choose an option: ");
        System.out.println("1. Rock, 2. Paper, 3. Scissors");
        player = keyboard.nextInt();

        System.out.println("The computer choose: ");

        switch(machine){

            case 1:
                System.out.println("Rock");
                switch (player){
                    case 1: System.out.println("It's a tie"); break;
                    case 2: System.out.println("You won!!");break;
                    case 3: System.out.println("You loose");break;
                }
                break;

            case 2:
                System.out.println("Paper");
                switch (player){
                    case 1: System.out.println("You loose");break;
                    case 2: System.out.println("It's a tie");break;
                    case 3: System.out.println("You won!!");break;
                }
                break;

            case 3:
                System.out.println("Scissors");
                switch (player){
                    case 1: System.out.println("You won!!");break;
                    case 2: System.out.println("You loose");break;
                    case 3: System.out.println("It's a tie");break;
                }
                break;
        }

    }


}