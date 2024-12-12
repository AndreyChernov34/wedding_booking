package com.javaacademy.wedding_booking.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Класс DTO для вывода забронированных дат
 */
@Data
@AllArgsConstructor
public class WeddingDateDto {
    @JsonProperty("monthNumber")
    private Integer month;
    @JsonProperty("dayNumber")
    private Integer day;
    boolean booked;
}
