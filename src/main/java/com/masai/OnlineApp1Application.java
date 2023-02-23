package com.masai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition( 
	    servers = {
	       @Server(url = "/", description = "Default Server URL")
	    }
	) 
@EnableSwagger2
@SpringBootApplication
public class OnlineApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(OnlineApp1Application.class, args);
	}

}
