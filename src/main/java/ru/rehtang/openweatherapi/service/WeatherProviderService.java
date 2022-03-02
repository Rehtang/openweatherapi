package ru.rehtang.openweatherapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.rehtang.openweatherapi.dto.ApiResponseDto;

import javax.annotation.PostConstruct;

@Service
public class WeatherProviderService {

  @Value("${openWeatherApi.url}")
  private String openWeatherUrl;

  @PostConstruct
  public void init() {
    System.out.println(getWeather());
  }

  public ApiResponseDto getWeather() {
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject(openWeatherUrl, ApiResponseDto.class);
  }
}
