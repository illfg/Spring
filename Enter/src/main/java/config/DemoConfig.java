package config;

import entity.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"entity","config"})
@Import({HelloWorld.class})
public class DemoConfig {

	@Bean
	public HelloWorld helloWorld(){
		return new HelloWorld();
	}
}
