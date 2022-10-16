package com.hillel.greenwoo.homeworks.homework14;

public class Iphone extends Ios implements Smartphones {

    @Override
    public void call() {
        System.out.println("Call from iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Write sms from iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Use internet from iPhone");
    }

    @Override
    void ios() {
        System.out.println("Hello from Iphone");
    }
}
