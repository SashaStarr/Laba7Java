package ua.lviv.iot.spring.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.spring.dataaccess", "ua.lviv.iot.spring.business",
    "ua.lviv.iot.spring.firstRest.controller" })
@EntityScan("ua.lviv.iot.spring.model")
@EnableJpaRepositories({ "ua.lviv.iot.spring.dataaccess" })
public class RestApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestApplication.class, args);
  }
}
