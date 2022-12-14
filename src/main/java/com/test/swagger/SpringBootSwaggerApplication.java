package com.test.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class SpringBootSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSwaggerApplication.class, args);
    }

}
