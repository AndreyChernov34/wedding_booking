package com.javaacedemy.wedding_booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeddingDateDto {
    private Integer monthNumber;
    private Integer dayNumber;
    boolean booked;

}
