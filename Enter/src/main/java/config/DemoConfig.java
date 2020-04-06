package config;

import entity.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}
}
