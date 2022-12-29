package ru.alexa.openweatherapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WindDto {

  private Float speed;
  private Float gust;
  private Integer deg;
}
