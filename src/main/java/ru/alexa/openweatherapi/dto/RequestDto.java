package ru.alexa.openweatherapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestDto {
    private String city;
    private Language language;
    private MetricSystem metricSystem;
}
