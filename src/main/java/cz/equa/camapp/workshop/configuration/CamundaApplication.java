package cz.equa.camapp.workshop.configuration;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"cz.equa.camapp"})
@EnableProcessApplication("workshopApplication")
public class CamundaApplication extends SpringBootServletInitializer {

	public static void main(final String... args) throws Exception {
		SpringApplication.run(CamundaApplication.class, args);
	}
}
