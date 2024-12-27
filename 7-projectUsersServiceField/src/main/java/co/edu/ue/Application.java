package co.edu.ue;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import co.edu.ue.Application;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.ue.controller",
		"co.edu.ue.repository","co.edu.ue.service","co.edu.ue"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
