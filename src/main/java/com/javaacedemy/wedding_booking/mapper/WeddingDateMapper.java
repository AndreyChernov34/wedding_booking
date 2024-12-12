package com.javaacedemy.wedding_booking.mapper;

import com.javaacedemy.wedding_booking.dto.WeddingDateDto;
import com.javaacedemy.wedding_booking.entity.WeddingDate;
import org.springframework.stereotype.Service;

@Service
public class WeddingDateMapper {
    public WeddingDateDto convert(WeddingDate weddingDate) {
        return new WeddingDateDto(weddingDate.getMonth(), weddingDate.getDay(), true);
    }
}
