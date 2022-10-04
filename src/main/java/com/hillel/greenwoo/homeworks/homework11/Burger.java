package com.hillel.greenwoo.homeworks.homework11;

import java.sql.SQLOutput;

public class Burger {

    String roll;
    String meat;
    String cheese;
    String green;
    String mayonnaise;
    boolean doubleMeat;

    public Burger(String roll, String meat, String cheese, String green, String mayonnaise) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        System.out.println(roll + " " + meat + " " + cheese + " " + green + " " + mayonnaise);
    }

    public Burger(String roll, String meat, String cheese, String green) {
        toString();
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        System.out.println(roll + " " + meat + " " + cheese + " " + green);
    }

    public Burger(String roll, String meat, String cheese, String green, String mayonnaise, boolean doubleMeat) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;
        System.out.println(roll + " " + meat + " " + cheese + " " + green + " " + mayonnaise + " " + doubleMeat);
    }

}
