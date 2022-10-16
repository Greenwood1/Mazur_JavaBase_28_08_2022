package com.hillel.greenwoo.homeworks.homework14;

public class Android extends Linux implements Smartphones {
    @Override
    public void call() {
        System.out.println("Call from android");
    }

    @Override
    public void sms() {
        System.out.println("Write sms from android");
    }

    @Override
    public void internet() {
        System.out.println("Use internet from android");
    }

    void linuxOs() {
        System.out.println("Hello from android!");
    }
}
