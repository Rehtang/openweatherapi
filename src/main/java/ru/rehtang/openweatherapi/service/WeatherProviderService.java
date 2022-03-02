package ru.rehtang.openweatherapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.rehtang.openweatherapi.dto.ApiResponseDto;

import javax.annotation.PostConstruct;

@Service
public class WeatherProviderService {

  private static final String OPEN_WEATHER_URL =
      "http://api.openweathermap.org/data/2.5/weather?q=Troitsk&appid=cea1fdf43d5f0f6984c884182cf02013&lang=ru&units=metric";

  @PostConstruct
  public void init() {
    System.out.println(getWeather());
  }

  public ApiResponseDto getWeather() {
    RestTemplate restTemplate = new RestTemplate();
    return restTemplate.getForObject(OPEN_WEATHER_URL, ApiResponseDto.class);
  }
}
