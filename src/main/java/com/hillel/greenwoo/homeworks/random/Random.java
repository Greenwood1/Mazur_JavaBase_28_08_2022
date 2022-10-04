package com.hillel.greenwoo.homeworks.random;

public class Random {
    static int getRandomNumber (int min, int max) {
        int number = (int) (Math.random() * (max - min + 1)) + min;
        return number;
    }

    static int[][] getRandomNumberForArray(int min, int max, int[][] arrayX) {

        for (int i = 0; i < arrayX.length; i++) {
            for (int k = 0; k < arrayX[i].length; k++) {
                arrayX[i][k] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
        return arrayX;
    }
}
