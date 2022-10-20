package com.hillel.greenwoo.homeworks.homework13;

public class RockMusic extends MusicStyles {
    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println("Play RockMusic " + getName());
    }
}
