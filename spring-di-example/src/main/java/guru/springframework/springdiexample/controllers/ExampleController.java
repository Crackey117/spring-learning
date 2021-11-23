package guru.springframework.springdiexample.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class ExampleController {

    public String SayHello(){
        System.out.println("Hello World!!!");

        return "hi folks!";
    }
}
