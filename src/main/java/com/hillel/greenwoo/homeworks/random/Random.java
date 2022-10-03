package com.hillel.greenwoo.homeworks.random;

public class Random {
    static int getRandomNumber (int min, int max) {
        int number = (int) (Math.random() * (max - min + 1)) + min;
        return number;
    }
}
