package com.hillel.greenwoo.homeworks.homework12;

public class Main {

    public static void main(String[] args) {
        GettersAndSetters userOne = new GettersAndSetters("Ivan", "Ivanov", "ivan@mail.com",
                "380631112233", 20,"september",1999,75,160,12000);

        System.out.println(userOne.printAccount());
    }
}
