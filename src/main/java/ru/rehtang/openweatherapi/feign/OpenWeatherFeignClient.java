package ru.rehtang.openweatherapi.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.rehtang.openweatherapi.dto.ApiResponseDto;

@FeignClient(name = "openWeatherFeignClient", url = "${openWeatherApi.feign.url}")
public interface OpenWeatherFeignClient {

  @GetMapping("/weather")
  ApiResponseDto receiveWeather(
      @RequestParam("q") String city,
      @RequestParam("appid") String apiKey,
      @RequestParam("lang") String language,
      @RequestParam("units") String metricSystem);
}
