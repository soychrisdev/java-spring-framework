package com.chrisprojects.firstspringfk;

import com.chrisprojects.firstspringfk.game.GameRunner;
import com.chrisprojects.firstspringfk.game.PacmanGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;

public class App02HelloWorldSpringJava {
    public static void main(String[] args) {
        //TODO: Launch a spring context
        //TODO: Configure the things that we want spring manage

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
//        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("age"));
//        System.out.println(context.getBean("address3"));
//        System.out.println(context.getBean("person2MethodCall"));
//        System.out.println(context.getBean("person3Parameters"));
//        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean(Person.class));
//        System.out.println(context.getBean(Address.class));
    }
}
