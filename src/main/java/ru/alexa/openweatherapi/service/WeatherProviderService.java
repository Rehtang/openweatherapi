package ru.alexa.openweatherapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.alexa.openweatherapi.dto.ApiResponseDto;
import ru.alexa.openweatherapi.dto.Language;
import ru.alexa.openweatherapi.feign.OpenWeatherFeignClient;
import ru.alexa.openweatherapi.dto.MetricSystem;

@Service
@RequiredArgsConstructor
public class WeatherProviderService {

  private final OpenWeatherFeignClient client;

  @Value("${openWeatherApi.feign.apiKey}")
  private String openWeatherApiKey;

  public ApiResponseDto receiveWeather(String city, Language language, MetricSystem metricSystem) {
    return client.receiveWeather(city, openWeatherApiKey, language, metricSystem);
  }
}
