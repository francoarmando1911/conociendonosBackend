package com.conociendonos.conociendonosBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.conociendonos.conociendonosBackend", "com/conociendonos/conociendonosBackend/controller", "com/conociendonos/conociendonosBackend/service", "com/conociendonos/conociendonosBackend/model", "com/conociendonos/conociendonosBackend/repository"})
public class ConociendonosBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConociendonosBackendApplication.class, args);
	}

}
