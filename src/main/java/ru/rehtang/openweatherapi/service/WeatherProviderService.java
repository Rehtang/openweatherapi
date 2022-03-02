package ru.rehtang.openweatherapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.rehtang.openweatherapi.dto.ApiResponseDto;

@RequiredArgsConstructor
@Service
public class WeatherProviderService {

  private final RestTemplate restTemplate;

  @Value("${openWeatherApi.url}")
  private String openWeatherUrl;

  public ApiResponseDto receiveWeather(String city) {
    var url = String.format(openWeatherUrl, city);
    return restTemplate.getForObject(url, ApiResponseDto.class);
  }
}
