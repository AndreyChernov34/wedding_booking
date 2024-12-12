package com.javaacedemy.wedding_booking.repository;

import com.javaacedemy.wedding_booking.entity.WeddingDate;
import com.javaacedemy.wedding_booking.service.WeddingDateService;
import com.javaacedemy.wedding_booking.storage.WeddingDateStorage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class WeddingDateRepository {
    private final WeddingDateStorage weddingDateStorage;

    public List<WeddingDate> getAllWeddingDateOfMonth(Integer month) {
        return weddingDateStorage.getAllWeddingDateOfMonth(month);
    }

    public Integer getSumAllWeddingDateOfMonth(Integer month) {
        return weddingDateStorage.getSumAllWeddingDateOfMonth(month);
    }

    public void  save(LocalDate localDate, WeddingDate weddingDate) {
        weddingDateStorage.save(localDate, weddingDate);
    }
}
