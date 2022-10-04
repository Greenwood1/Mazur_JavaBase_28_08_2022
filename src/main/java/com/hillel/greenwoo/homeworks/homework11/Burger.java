package com.hillel.greenwoo.homeworks.homework11;

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
        System.out.println(toString());
    }

    public Burger(String roll, String meat, String cheese, String green) {
        toString();
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
    }

    public Burger(String roll, String meat, String cheese, String green, String mayonnaise, boolean doubleMeat) {
        this.roll = roll;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "roll='" + roll + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", green='" + green + '\'' +
                ", mayonnaise='" + mayonnaise + '\'' +
                '}';
    }
}
