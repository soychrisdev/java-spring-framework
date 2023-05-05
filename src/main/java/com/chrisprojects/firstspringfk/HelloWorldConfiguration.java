package com.chrisprojects.firstspringfk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {}
record Address( String firstLine, String city){}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Christian";
    }
    @Bean
    public int age() {
        return 23;
    }@Bean
    public Person person() {
        return new Person("Christian", 23 );
    }
    @Bean
    public Address address() {
        return new Address( "lo amor", "Santiago");
    }
}
