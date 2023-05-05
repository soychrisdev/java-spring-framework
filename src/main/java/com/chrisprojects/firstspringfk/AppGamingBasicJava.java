package com.chrisprojects.firstspringfk;

import com.chrisprojects.firstspringfk.game.GameRunner;
import com.chrisprojects.firstspringfk.game.MarioGame;
import com.chrisprojects.firstspringfk.game.PacmanGame;
import com.chrisprojects.firstspringfk.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
