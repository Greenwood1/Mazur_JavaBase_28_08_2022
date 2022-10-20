package com.hillel.greenwoo.homeworks.homework15;

import com.hillel.greenwoo.homeworks.homework15.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int totalPrice = 0;

    public static void main(String[] args) {
        runMachine();
        System.out.println("Кількість напоїв " + Drink.count);
        System.out.println("Загальна вартість " + totalPrice);

    }

    public static void runMachine() {
        System.out.println("You can buy: " + Arrays.toString(DrinksMachine.values()));
        while (true) {
            DrinksMachine drinksMachine = getDrinkType();
            if (getDrinkType() == null) {
                return;
            }


            switch (drinksMachine) {
                case TEA -> {
                    System.out.println("Your drink " + DrinksMachine.TEA.getTitle() + " is ready, its price " + Drinks.TEA_PRICE);
                    totalPrice += Drink.count;
                    break;
                }
                case COFFEE -> {
                    System.out.println("Your drink " + DrinksMachine.COFFEE.getTitle() + " is ready, its price " + Drinks.COFFEE_PRICE);
                    totalPrice += Drink.count;
                    break;
                }
                case LEMONADE -> {
                    System.out.println("Your drink " + DrinksMachine.LEMONADE.getTitle() + " is ready, its price " + Drinks.LEMONADE_PRICE);
                    totalPrice += Drink.count;
                    break;
                }
                case MOJITO -> {
                    System.out.println("Your drink " + DrinksMachine.MOJITO.getTitle() + " is ready, its price " + Drinks.MOJITO_PRICE);
                    totalPrice += Drink.count;
                    break;
                }
                case WATER -> {
                    System.out.println("Your drink " + DrinksMachine.WATER.getTitle() + " is ready, its price " + Drinks.WATER_PRICE);
                    totalPrice += Drink.count;
                    break;
                }
                case COLA -> {
                    System.out.println("Your drink " + DrinksMachine.COLA.getTitle() + " is ready, its price " + Drinks.COCA_COLA_PRICE);
                    totalPrice += Drink.count;
                    break;
                }
            }

        }
    }

    private static DrinksMachine getDrinkType() {
        System.out.println("Please choose drink or click on \"Exit\"");

        while (true) {
            String str = scanner.nextLine().toUpperCase();

            if (str.equals("EXIT")) {
                return null;
            }

            for (DrinksMachine value : DrinksMachine.values()) {
                if (str.equals(value.toString())) {
                    return DrinksMachine.valueOf(str);
                }
            }
            System.out.println("Please choose drink from list " + Arrays.toString(DrinksMachine.values()));
        }
    }
}
