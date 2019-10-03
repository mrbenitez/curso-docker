package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    private MyappRepository myappRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Component
    public class LoadData implements CommandLineRunner {

        @Override
        public void run(String... args) {
            myappRepository.save(new Person(1, "Lucas","Sanchez"));
            myappRepository.save(new Person(2, "Laia" ,"Gonzalez"));
        }
    }
}
