package com.javaacademy.wedding_booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Класс DTO для вывода забронированных дат
 */
@Data
@AllArgsConstructor
public class WeddingDateDto {
    private Integer monthNumber;
    private Integer dayNumber;
    boolean booked;
}
