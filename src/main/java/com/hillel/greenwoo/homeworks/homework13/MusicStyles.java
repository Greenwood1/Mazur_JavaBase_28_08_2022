package com.hillel.greenwoo.homeworks.homework13;

public abstract class MusicStyles {
    private String name;

    public MusicStyles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void playMusic();
}
