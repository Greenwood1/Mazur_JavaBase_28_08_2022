package com.hillel.greenwoo.homeworks.homework9;

import java.util.Scanner;

public class TranspositionOfMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m;
        int n;

        System.out.println("Pleas enter M");
        m = enterNumber(scanner);

        System.out.println("Pleas enter N");
        n = enterNumber(scanner);

        int[][] arrayM = new int[n][m];
        int[][] arrayN = new int[m][n];

        for (int i = 0; i < arrayM.length; i++) {
            for (int j = 0; j < arrayM[i].length; j++) {
                arrayM[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Array BEFORE");
        printArray(arrayM);

        System.out.println("Array AFTER ");
        transform(arrayM, arrayN);

        printArray(arrayN);
    }

    private static void transform(int[][] arrayM, int[][] arrayN) {
        for (int i = 0; i < arrayN.length; i++) {
            for (int j = 0; j < arrayN[i].length; j++) {
                arrayN[i][j] = arrayM[j][i];
            }
        }
    }

    static int enterNumber(Scanner x) {
        int temp;
        while (true) {
            if (x.hasNextInt()) {
                temp = x.nextInt();
                if (temp < 0) {
                    System.out.println("Wrong data. Please enter positive number!");
                } else {
                    return temp;
                }
                x.nextLine();
            } else {
                System.out.println("Wrong data. Try again!");
                x.nextLine();
            }
        }
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
