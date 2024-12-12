package com.javaacademy.wedding_booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Класс DTO для передачи количества забронированных дат в месяце
 */
@Data
@AllArgsConstructor
public class CountDto {
    private Long count;
}
