package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

public class Movie{
    @Autowired
    private Actor actor;


    public void show(){
        System.out.println(actor.name);
        System.out.println(actor.gender);
        System.out.println(actor.age);
    }
}
