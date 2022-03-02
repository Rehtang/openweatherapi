package ru.rehtang.openweatherapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.rehtang.openweatherapi.dto.ApiResponseDto;
import ru.rehtang.openweatherapi.feign.OpenWeatherFeignClient;

@RequiredArgsConstructor
@Service
public class WeatherProviderService {

  private final OpenWeatherFeignClient client;

  @Value("${openWeatherApi.feign.apiKey}")
  private String openWeatherApiKey;

  public ApiResponseDto receiveWeather(String city) {
    return client.receiveWeather(city, openWeatherApiKey, "ru", "metric");
  }
}
