package com.chrisprojects.firstspringfk;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {}
record Address(String firstLine, String city){}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Christian";
    }
    @Bean
    public int age() {
        return 23;
    }

//    @Bean
//    public int age() {
//        return 23;
//    }
//    @Bean
//    public int age() {
//        return 23;
//    }@Bean
//    public int age() {
//        return 23;
//    }
    @Bean
    public Person person() {
        return new Person("Christian", 23, address() );
    }
    @Bean(name = "person2MethodCall")
    public Person person2MethodCall(){
     return new Person(name(), age(), address());
    }
    @Bean(name = "person3Parameters")
    @Primary()
    public Person person3Parameters(String name, int age, @Qualifier("address3qualifier") Address address3){
     return new Person(name(), age(), address3);
    }

    @Bean(name = "person4Parameters")

    public Person person4Parameters(String name, int age, Address address2){
     return new Person(name(), age(), address2);
    }
    @Bean(name = "person5Parameters")
    public Person person5Parameters(String name, int age, Address address3){
     return new Person(name(), age(), address3);
    }
    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address() {
        return new Address( "lo amor", "Santiago");
    }

    @Bean(name = "address2")
    @Primary()
    public Address address2() {
        return new Address( "Cerro", "Santiago");
    }
}
