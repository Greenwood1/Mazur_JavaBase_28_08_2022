package com.hillel.greenwoo.homeworks.homework10;

import org.w3c.dom.ls.LSOutput;

public class Person {
    public static void main(String[] args) {

        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));

    }

    static String personInfo(String name, String surname, String city, String number) {

        String str = "Make a call: "
                + name
                + " "
                + surname
                + " from the city "
                + city
                + " "
                + number
                +".";
        return str;
    }
}
