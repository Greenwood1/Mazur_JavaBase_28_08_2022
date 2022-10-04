package com.hillel.greenwoo.homeworks.homework11;

public class BurgerMain {

    public static void main(String[] args) {


        Burger regularBurger = new Burger("roll", "meat", "cheese", "green",
                "mayonnaise");

        Burger dietBurger = new Burger("roll", "meat", "cheeese", "green");

        Burger doubleMeat = new Burger("roll", "meat", "cheese", "green",
                "mayonnaise", true);
    }
}
