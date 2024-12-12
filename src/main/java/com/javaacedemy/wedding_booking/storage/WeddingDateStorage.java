package com.javaacedemy.wedding_booking.storage;

import com.javaacedemy.wedding_booking.entity.WeddingDate;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@AllArgsConstructor
public class WeddingDateStorage {
    private final Map<LocalDate, WeddingDate> weddingDateMap = new HashMap<>();

    public List<WeddingDate> getAllWeddingDateOfMonth(Integer month) {
        return weddingDateMap.values().stream().filter(weddingDate -> weddingDate.getMonth().equals(month)).toList();
    }

    public Integer getSumAllWeddingDateOfMonth(Integer month) {
        return (int) weddingDateMap.values().stream().
                filter(weddingDate -> weddingDate.getMonth().equals(month))
                .count();
    }

    public void save(LocalDate localDate, WeddingDate weddingDate) {
        weddingDateMap.put(localDate, weddingDate);
    }

}
