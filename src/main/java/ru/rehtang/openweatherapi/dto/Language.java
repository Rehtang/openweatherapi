package ru.rehtang.openweatherapi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Language {
  RU("ru"),
  EN("en"),
  FR("fr");

  private final String code;
}
