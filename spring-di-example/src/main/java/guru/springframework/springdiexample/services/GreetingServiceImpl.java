package guru.springframework.springdiexample.services;

public class GreetingServiceImpl implements GreetingService{

    @Override
    public String sayGreeting() {
        return "HelloWorld";
    }
}
