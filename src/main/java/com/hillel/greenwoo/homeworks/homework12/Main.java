package com.hillel.greenwoo.homeworks.homework12;

public class Main {

    public static void main(String[] args) {
        GettersAndSetters stewart = new GettersAndSetters("James", "Stewart", "stewart@mail.com",
                "031(350)051-39-68", 20, "may", 1908, 70,
                160, 55000);

        GettersAndSetters bogart = new GettersAndSetters("Humphrey", "Bogart", "bogart@mail.com",
                "08(7903)324-55-70", 14, "december", 1899, 80,
                160, 30000);

        GettersAndSetters holden = new GettersAndSetters("William", "Holden", "holden@mail.com",
                "466(790)246-82-77", 17, "april", 1918, 80,
                160, 12000);

        GettersAndSetters bacall = new GettersAndSetters("Lauren", "Bacall", "bacall@mail.com",
                "4(99)992-23-90", 16, "september", 1924, 50,
                160, 18000);

        GettersAndSetters hepburn = new GettersAndSetters("Katharine", "Hepburn", "hepburn@mail.com",
                "5(2519)434-48-97", 12, "may", 1941, 55,
                160, 19000);

        System.out.println(stewart.printAccount());
        System.out.println("");
        System.out.println(bogart.printAccount());
        System.out.println("");
        System.out.println(holden.printAccount());
        System.out.println("");
        System.out.println(bacall.printAccount());
        System.out.println("");
        System.out.println(hepburn.printAccount());

        bacall.setSurname("Holden");
        bacall.setSteps(22000);

        hepburn.setSurname("Stewart");
        hepburn.setSteps(34000);

        System.out.println("");
        System.out.println("AFTER CHANGES");
        System.out.println(bacall.printAccount());
        System.out.println("");
        System.out.println(hepburn.printAccount());


    }
}
