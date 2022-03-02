package ru.rehtang.openweatherapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.rehtang.openweatherapi.dto.ApiResponseDto;

@Service
public class WeatherProviderService {

  @Value("${openWeatherApi.url}")
  private String openWeatherUrl;

  public ApiResponseDto receiveWeather(String city) {
    RestTemplate restTemplate = new RestTemplate();
    var url = String.format(openWeatherUrl,city);
    return restTemplate.getForObject(url, ApiResponseDto.class);
  }
}
