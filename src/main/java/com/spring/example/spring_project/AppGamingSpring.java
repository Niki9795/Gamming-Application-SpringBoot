package com.spring.example.spring_project;

import com.spring.example.spring_project.game.GameRunner;
import com.spring.example.spring_project.game.GamingConsole;
import com.spring.example.spring_project.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppGamingSpring {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfiguration.class );
        context.getBean(GamingConsole.class).up();
    }
}
