package com.hillel.greenwoo.homeworks.homework14;

public class Main {
    public static void main(String[] args) {
      Android android = new Android();
      Iphone iphone = new Iphone();

      android.call();
      android.sms();
      android.internet();
      android.linuxOs();

        System.out.println("");

        iphone.call();
        iphone.sms();
        iphone.internet();
        iphone.ios();
    }
}
