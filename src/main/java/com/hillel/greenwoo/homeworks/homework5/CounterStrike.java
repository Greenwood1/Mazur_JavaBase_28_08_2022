package com.hillel.greenwoo.homeworks.homework5;


import java.util.Scanner;

public class CounterStrike {
    public static final int COUNT_PLAYERS_IN_TEAM = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name for first team:");
        String firstTeam = scanner.nextLine();

        System.out.println("Enter name for second team:");
        String secondTeam = scanner.nextLine();

        System.out.println("Enter points for first team: ");
        int pointFirstTeam = 0;
        for (int i = 0; i< COUNT_PLAYERS_IN_TEAM; i++) {
            int point = scanner.nextInt();
            pointFirstTeam += point;
        }

        System.out.println("Enter points for second team: ");
        int pointSecondTeam = 0;
        for (int i = 0; i< COUNT_PLAYERS_IN_TEAM; i++) {
            int point = scanner.nextInt();
            pointSecondTeam += point;
        }

        if (pointFirstTeam > pointSecondTeam) {
            System.out.println("win " + firstTeam + " with " + pointFirstTeam + " points");
        } else if (pointFirstTeam < pointSecondTeam) {
            System.out.println("win " + secondTeam + " with " + pointSecondTeam + " points");
        } else {
            System.out.println("draw");
        }

    }
}
