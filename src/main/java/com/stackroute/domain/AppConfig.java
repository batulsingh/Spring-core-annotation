package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Actor actor(){
        return new Actor(41,"Will Smith","Male");
    }
    @Bean
    public  Movie movie(){
        return new Movie();
    }
}
