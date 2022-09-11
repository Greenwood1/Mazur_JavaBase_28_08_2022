package com.hillel.greenwoo.homeworks.homework4;

public class ChineseDynasties {

    public static void main(String[] args) {
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        final int SOLDIERS_LI = 860;

        int attackRateLi = (warriorLi + archerLi + riderLi) * SOLDIERS_LI;
        System.out.println("The general attack of the Li dynasty: " + attackRateLi);

        final double MULTIPLIER = 1.5;

        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;

        double attackRateMin = SOLDIERS_LI * MULTIPLIER * (warriorMin + archerMin + riderMin);

        System.out.println("The general attack of the Li dynasty: " + attackRateMin);


    }
}
