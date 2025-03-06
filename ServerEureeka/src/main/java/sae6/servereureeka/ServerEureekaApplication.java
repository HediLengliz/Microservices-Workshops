package sae6.servereureeka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServerEureekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerEureekaApplication.class, args);
    }

}
