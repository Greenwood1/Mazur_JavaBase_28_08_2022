package com.hillel.greenwoo.homeworks.homework7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {


        int[] team1 = new int[25];
        int[] team2 = new int[25];

        for (int i = 0; i < team1.length; i++) {
            team1[i] = 18 + (int) (Math.random() * 23);
            team2[i] = 18 + (int) (Math.random() * 23);
        }

        System.out.println(Arrays.toString(team1));
        System.out.println("");
        System.out.println(Arrays.toString(team2));
        System.out.println("");

        System.out.println("Average age of the team #1 " + Rugby.plus(team1) / team1.length);
        System.out.println("Average age of the team #2 " + Rugby.plus(team2) / team2.length);

    }

    public static int plus(int array[]) {
        int middleAge = 0;
        for (int value : array) {
            middleAge += value;
        }
        return middleAge;
    }
}
