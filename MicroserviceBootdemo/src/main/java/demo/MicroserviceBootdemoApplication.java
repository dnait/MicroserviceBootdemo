package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MicroserviceBootdemoApplication extends SpringBootServletInitializer{
	
	/**
	 * Used for Jar
	 * */
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBootdemoApplication.class, args);
	}
	
	/**
	 * Used for War
	 * */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroserviceBootdemoApplication.class);
	}
}
