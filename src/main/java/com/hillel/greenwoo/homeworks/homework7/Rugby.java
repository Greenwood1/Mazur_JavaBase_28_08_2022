package com.hillel.greenwoo.homeworks.homework7;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {


        int[] team1 = new int[25];
        int[] team2 = new int[25];

        Rugby.random(team1);
        System.out.println("");
        Rugby.random(team2);

        System.out.println("Average age of the team #1 " + Rugby.average(team1) / team1.length);
        System.out.println("Average age of the team #2 " + Rugby.average(team2) / team2.length);

    }

    public static int average(int array[]) {
        int middleAge = 0;
        for (int value : array) {
            middleAge += value;
        }
        return middleAge;
    }

    public static void random (int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 18 + (int) (Math.random() * 28);
        }
        System.out.println(Arrays.toString(array));
    }
}
