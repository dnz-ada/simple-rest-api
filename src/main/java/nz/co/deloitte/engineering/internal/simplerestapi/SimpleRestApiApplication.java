package nz.co.deloitte.engineering.internal.simplerestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SimpleRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleRestApiApplication.class, args);
	}

}
