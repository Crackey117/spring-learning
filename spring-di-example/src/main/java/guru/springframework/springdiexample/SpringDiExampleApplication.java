package guru.springframework.springdiexample;

import guru.springframework.springdiexample.controllers.ExampleController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiExampleApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDiExampleApplication.class, args);

		ExampleController exampleController = (ExampleController) ctx.getBean("exampleController");

		String hi = exampleController.SayHello();

		System.out.println(hi);
	}

}
