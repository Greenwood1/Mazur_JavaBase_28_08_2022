package com.hillel.greenwoo.homeworks.homework6;

public class ShuttleNumbers {
    public static void main(String[] args) {
        int counter = 0;
        int shuttleNumber;
        for (shuttleNumber = 1; shuttleNumber < 170; shuttleNumber++) {
            if ((shuttleNumber == 4) || (shuttleNumber == 9) || (shuttleNumber / 10 == 4)
                    || (shuttleNumber / 10 == 9)
                    || (shuttleNumber % 10 == 4) || (shuttleNumber % 10 == 9)
                    || (shuttleNumber / 10 % 10 == 4) || (shuttleNumber / 10 % 10 == 9)) {
                continue;
            }
            System.out.println("shuttle number:" + shuttleNumber);
            counter++;

        }
        System.out.println("count = "+counter);
    }
}
