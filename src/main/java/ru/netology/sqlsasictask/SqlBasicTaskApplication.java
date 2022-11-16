package ru.netology.sqlsasictask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SqlBasicTaskApplication {

    private UserService service = new UserService();

    public static void main(String[] args) {
        SpringApplication.run(SqlBasicTaskApplication.class, args);
    }

    @GetMapping("/products/fetch-product")
    public String hello(@RequestParam("name") String name) {
        return service.handler(name);
    }
}
