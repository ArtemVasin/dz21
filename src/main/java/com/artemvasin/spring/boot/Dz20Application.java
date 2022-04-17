package com.artemvasin.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Dz20Application {

    public static void main(String[] args) {
       ConfigurableApplicationContext context = SpringApplication.run(Dz20Application.class, args);
       Game game= context.getBean(Game.class);
       game.newGame();


    }

}
