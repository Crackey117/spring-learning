package guru.springframework.springdiexample.controllers;

import guru.springframework.springdiexample.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    void sayGreeting(){
        System.out.println(controller.getGreeting());
    }

}