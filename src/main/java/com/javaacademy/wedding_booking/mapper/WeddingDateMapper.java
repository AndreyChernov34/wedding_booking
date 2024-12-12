package com.javaacademy.wedding_booking.mapper;

import com.javaacademy.wedding_booking.dto.WeddingDateDto;
import com.javaacademy.wedding_booking.entity.WeddingDate;
import org.springframework.stereotype.Service;

@Service
public class WeddingDateMapper {

    /**
     * Конвертация из сущности свадебного дня в передаваемый формат забронированного дня
     *
     * @param weddingDate свадебный день
     * @return DTO для передачи в запрос
     */
    public WeddingDateDto convert(WeddingDate weddingDate) {
        return new WeddingDateDto(weddingDate.getMonth(), weddingDate.getDay(), true);
    }
}
