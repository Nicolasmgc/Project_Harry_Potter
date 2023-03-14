package isep.app;

import java.util.Scanner;

public class GameMethod {
    public static void main(String[] args){
        StartGame();


    }
    private static void anythingToContinue() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter a button to continue your journey");
        scanner.next();

    }

    private static void StartGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Congratulations young wizard you have been accepted to Hogwarts ! ");
        System.out.println("What is your name ?");
        String wName = scanner.nextLine();


        System.out.println("Before starting your adventure you will have to choose your pet and your wand, the SortingHat will choose your home");
        GameMethod.anythingToContinue();




    }



}

