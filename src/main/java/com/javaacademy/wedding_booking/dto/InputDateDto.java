package com.javaacademy.wedding_booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Класс DTO для получения даты бронирования
 */
@Data
@AllArgsConstructor
public class InputDateDto {
    private Integer month;
    private Integer day;
}
