package ru.rehtang.openweatherapi.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.rehtang.openweatherapi.dto.ApiResponseDto;
import ru.rehtang.openweatherapi.dto.MetricSystem;
import ru.rehtang.openweatherapi.dto.RequestDto;
import ru.rehtang.openweatherapi.service.WeatherProviderService;

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
