package com.ics.demo;

import com.ics.demo.oop.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

    }

}
//        Birds birds = new Birds("chicken", TypeOfEye.COMPOUND,TypeOfBeak.BLUNT);
//        Mammals mammals = new Mammals("Human", TypeOfEye.SIMPLE, 2, 9);
//        Fish fish = new Fish("Tilapia", TypeOfEye.SIMPLE, 4);
//
//        System.out.println(birds.toString());
//        birds.move();
//        System.out.println(fish.toString());
//        fish.move();
//        System.out.println(mammals.toString());
//        mammals.move();


