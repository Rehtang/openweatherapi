package ru.alexa.openweatherapi.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MetricSystem {
  STANDARD("standard"),
  METRIC("metric"),
  IMPERIAL("imperial");

  private final String metricCode;
}
