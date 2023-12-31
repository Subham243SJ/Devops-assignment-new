package io.bootify.my_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class MyAppApplication {
    @GetMapping("/message")
    public String getMessage() {
        return "Dockerizing the Spring Boot Application ";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyAppApplication.class, args);
    }

}
