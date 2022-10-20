package com.hillel.greenwoo.homeworks.homework13;

public class Main {
    public static void main(String[] args) {
        MusicStyles [] musicStyles = {
                new RockMusic("Linkin Park"),
                new ClassicMusic("Beethoven"),
                new PopMusic("Maroon 5")
        };
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}
