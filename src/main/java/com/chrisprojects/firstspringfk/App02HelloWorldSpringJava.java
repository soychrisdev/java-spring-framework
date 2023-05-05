package com.chrisprojects.firstspringfk;

import com.chrisprojects.firstspringfk.game.GameRunner;
import com.chrisprojects.firstspringfk.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpringJava {
    public static void main(String[] args) {
        //TODO: Launch a spring context
        //TODO: Configure the things that we want spring manage

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("address"));
    }
}
