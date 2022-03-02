package ru.rehtang.openweatherapi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponseDto {

  private Integer id;
  private Integer cod;
  private String name;
  private CoordDto coord;
  private List<WeatherDto> weather;
  private BaseDto base;
  private MainDto main;
  private WindDto wind;
}