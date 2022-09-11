package com.hillel.greenwoo.homeworks.homework5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String teamA,teamB;
        teamA = teamB = null;
        boolean ressult = teamA != null && teamB != null;

        System.out.println("A = " + teamA );
        System.out.println("B = " + teamB );

        System.out.println("result " +ressult);

//        if (teamA & teamB ==  null) {
//            System.out.println("Please enter name team");
//            teamA = setNameTeam();
//        }

        System.out.println(teamA);
        System.out.println(teamB);

    }


    public static String setNameTeam() {
        Scanner scaner = new Scanner(System.in);
        String nameTeam = scaner.nextLine();
        return nameTeam;
    }



}
