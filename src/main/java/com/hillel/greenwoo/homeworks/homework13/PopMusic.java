package com.hillel.greenwoo.homeworks.homework13;

public class PopMusic extends MusicStyles {
    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Play PopMusic " + getName());

    }
}
