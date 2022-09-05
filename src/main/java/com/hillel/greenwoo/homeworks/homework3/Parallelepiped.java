package com.hillel.greenwoo.homeworks.homework3;

public class Parallelepiped {
    public static void main(String[] args) {
        int a, b, c;
        a = b = c = 6;

        int volume = a * b * c;
        System.out.println("Volume of a parallelepiped: " + volume);

        int length = 4 * (a + b + c);
        System.out.println("Total length of all sides: " + length);
    }
}
