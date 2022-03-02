package ru.rehtang.openweatherapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class RequestDto {
    private String city;
}
