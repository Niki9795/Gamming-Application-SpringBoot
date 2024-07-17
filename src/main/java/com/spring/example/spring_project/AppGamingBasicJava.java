package com.spring.example.spring_project;

import com.spring.example.spring_project.game.GameRunner;
import com.spring.example.spring_project.game.PacmanGame;
import com.spring.example.spring_project.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

//        var game = new MarioGame();
        var game = new PacmanGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
