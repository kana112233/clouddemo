package client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EurekaClientApplication {


    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello(){
        return "hello " + port;
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }

}
