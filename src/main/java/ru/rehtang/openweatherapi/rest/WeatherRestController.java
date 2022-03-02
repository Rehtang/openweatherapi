package ru.rehtang.openweatherapi.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.rehtang.openweatherapi.dto.ApiResponseDto;
import ru.rehtang.openweatherapi.dto.RequestDto;
import ru.rehtang.openweatherapi.service.WeatherProviderService;

@RestController
@RequiredArgsConstructor
public class WeatherRestController {
  private final WeatherProviderService service;

  @GetMapping("/weather")
  public ApiResponseDto getWeather(@RequestBody RequestDto requestDto) {

    return service.receiveWeather(requestDto.getCity());
  }
}