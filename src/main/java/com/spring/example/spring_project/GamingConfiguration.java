package com.spring.example.spring_project;

import com.spring.example.spring_project.game.GameRunner;
import com.spring.example.spring_project.game.GamingConsole;
import com.spring.example.spring_project.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }
}
