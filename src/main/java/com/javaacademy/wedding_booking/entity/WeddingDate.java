package com.javaacademy.wedding_booking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Сущность - дата свадьбы
 */
@Data
@AllArgsConstructor
public class WeddingDate {
    private Integer month;
    private Integer day;
}
