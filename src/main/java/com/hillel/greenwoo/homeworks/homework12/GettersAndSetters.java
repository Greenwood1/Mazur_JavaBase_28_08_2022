package com.hillel.greenwoo.homeworks.homework12;

public class GettersAndSetters {
    public static final int CURRENT_YEAR = 2020;
    private String name;
    private String surname;
    private String email;
    private String number;
    private int dayOfBirth;
    private String monthOfBirth;
    private int yearOfBirth;
    private int age;
    private int weight;
    private int pressure;
    private int steps;


    public GettersAndSetters(String name, String surname, String email, String number, int dayOfBirth,
                             String monthOfBirth, int yearOfBirth, int weight, int pressure, int steps) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.number = number;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        age(yearOfBirth);

    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getAge() {
        return age;
    }

    private void age(int year) {
        age = CURRENT_YEAR - year;
    }


    public String printAccount() {
        return "Account: " + '\n' +
                "Name: " + getName() + '\n' +
                "Surname: " + getSurname() + '\n' +
                "Date of Birth: " + getDayOfBirth() + " " + getMonthOfBirth() + " " + getYearOfBirth() + '\n' +
                "Age: " + getAge() + '\n' +
                "Email: " + getEmail() + '\n' +
                "Phone number: " + getNumber() + '\n' +
                "Weight: " + getWeight() + '\n' +
                "Pressure: " + getPressure() + '\n' +
                "Steps: " + getSteps();
    }

}
