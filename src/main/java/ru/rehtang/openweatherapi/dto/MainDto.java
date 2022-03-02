package ru.rehtang.openweatherapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MainDto {

  private Float temp;

  @JsonProperty("feels_like")
  private Float feelsLike;

  @JsonProperty("temp_min")
  private Float tempMin;

  @JsonProperty("temp_max")
  private Float tempMax;

  private Integer pressure;
  private Integer humidity;

  @JsonProperty("sea_level")
  private Integer seaLevel;

  @JsonProperty("grnd_level")
  private Integer grndLevel;
}
