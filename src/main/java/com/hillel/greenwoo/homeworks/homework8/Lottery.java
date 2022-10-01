package com.hillel.greenwoo.homeworks.homework8;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {


        int[] organazerOfTheLottery = new int[10];
        int[] player = new int[10];
        int[] result = new int[organazerOfTheLottery.length];


        for (int i = 0; i < organazerOfTheLottery.length; i++) {
            organazerOfTheLottery[i] = (int) (Math.random() * 10);
            player[i] = (int) (Math.random() * 10);
        }

        Lottery.bubbleSort(organazerOfTheLottery);
        Lottery.bubbleSort(player);

        System.out.println("Numbers provided by the lottery organizing company:");
        System.out.println(Arrays.toString(organazerOfTheLottery));

        System.out.println();
        System.out.println("The numbers guessed by the player:");
        System.out.println(Arrays.toString(player));

        int counter = 0;
        for (int i = 0; i < organazerOfTheLottery.length; i++) {
            if (organazerOfTheLottery[i] == player[i]) {
                int temp = organazerOfTheLottery[i];
                result[counter] = temp;
                counter++;
            }
        }

        int[] resultSecond = new int[counter];
        for (int i = 0; i < resultSecond.length; i++) {
            resultSecond[i] = result[i];
            System.out.println("");
            System.out.println("Numbers " + resultSecond[i] + " matched.");
        }


    }

    static void bubbleSort(int[] array) {
        boolean isSorted = false;
        int temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

}
