package ru.alexa.openweatherapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.alexa.openweatherapi.dto.ApiResponseDto;
import ru.alexa.openweatherapi.dto.Language;
import ru.alexa.openweatherapi.dto.MetricSystem;

@FeignClient(name = "openWeatherFeignClient", url = "${openWeatherApi.feign.url}")
public interface OpenWeatherFeignClient {

  @GetMapping("/weather")
  ApiResponseDto receiveWeather(
      @RequestParam("q") String city,
      @RequestParam("appid") String apiKey,
      @RequestParam("lang") Language language,
      @RequestParam("units") MetricSystem metricSystem);
}
