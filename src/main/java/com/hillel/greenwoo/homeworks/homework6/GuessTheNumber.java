package com.hillel.greenwoo.homeworks.homework6;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int computer;
        int player;

        computer = (int) (Math.random() * 11);
        System.out.println(computer);
        System.out.println("Guess what number I guessed!");
        System.out.println("Write your answer below ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            if (scanner.hasNextInt()) {
                player = scanner.nextInt();
                if (player == computer) {
                    System.out.println("You are lucky, you guessed it!");
                    break;
                } else if (player != computer) {
                    System.out.println("Maybe try again?");
                } else {
                    System.out.println("Sorry, but you lost");
                }
            } else {
                System.out.println("Invalid data, please use whole numbers");
                i--;
                scanner.nextLine();
            }
        }

    }
}
