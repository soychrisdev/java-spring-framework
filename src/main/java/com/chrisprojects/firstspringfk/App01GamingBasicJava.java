package com.chrisprojects.firstspringfk;

import com.chrisprojects.firstspringfk.game.GameRunner;
import com.chrisprojects.firstspringfk.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
