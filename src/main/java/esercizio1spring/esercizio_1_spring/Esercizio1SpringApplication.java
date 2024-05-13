package esercizio1spring.esercizio_1_spring;

import appConfig.AppConfig;
import beans.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Collectors;

@SpringBootApplication
public class Esercizio1SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio1SpringApplication.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		Menu menu1 = ctx.getBean(Menu.class);
		menu1.stampaMenu();



	}



}
