package ru.alexa.openweatherapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI openApi() {
    return new OpenAPI().servers(serverList()).info(apiInfo());
  }

  private Info apiInfo() {
    return new Info()
        .title("OpenWeather Provider Service")
        .description("Сервис по получению погоды от сервиса погоды")
        .version("1.0")
        .contact(
            new Contact()
                .name("Alexandra")
                .email("aleksandra22811@mail.ru")
        );
  }

  private List<Server> serverList() {
    return List.of(new Server().url("/").description("localhost"));
  }
}