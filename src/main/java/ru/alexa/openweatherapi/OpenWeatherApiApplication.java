package ru.alexa.openweatherapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenWeatherApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(OpenWeatherApiApplication.class, args);
  }
}



