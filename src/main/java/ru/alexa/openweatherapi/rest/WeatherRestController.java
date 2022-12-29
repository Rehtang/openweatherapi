package ru.alexa.openweatherapi.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.alexa.openweatherapi.dto.ApiResponseDto;
import ru.alexa.openweatherapi.dto.MetricSystem;
import ru.alexa.openweatherapi.dto.RequestDto;
import ru.alexa.openweatherapi.service.WeatherProviderService;

@RestController
@RequiredArgsConstructor
public class WeatherRestController {

  private final WeatherProviderService service;

  @PostMapping(value = "/weather", produces = MediaType.APPLICATION_JSON_VALUE)
  public ApiResponseDto getWeather(@RequestBody RequestDto requestDto) {
  MetricSystem reservedMetricSystem = requestDto.getMetricSystem();
    return service.receiveWeather(
        requestDto.getCity(),
        requestDto.getLanguage(),
        reservedMetricSystem == null
            ? MetricSystem.STANDARD
            : reservedMetricSystem);
  }
}
