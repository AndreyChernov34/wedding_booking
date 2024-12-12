package com.javaacademy.wedding_booking.storage;

import com.javaacademy.wedding_booking.entity.WeddingDate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class WeddingDateStorage {
    private final Map<LocalDate, WeddingDate> weddingDateMap = new HashMap<>();

    /**
     * Возвращает список забронированных дней в заданном месяце
     *
     * @param month месяц
     * @return список забронированных дней
     */
    public List<WeddingDate> getAllWeddingDateOfMonth(Integer month) {
        return weddingDateMap.values().stream().filter(weddingDate -> weddingDate.getMonth().equals(month)).toList();
    }

    /**
     * Возвращает количество забронированных дней в заданном месяце
     *
     * @param month месяц
     * @return количество забронированных дней
     */
    public Long getSumAllWeddingDateOfMonth(Integer month) {
        return weddingDateMap.values()
                .stream()
                .filter(weddingDate -> weddingDate.getMonth().equals(month))
                .count();
    }

    /**
     * Метод записи бронированной даты
     *
     * @param localDate   Дата события
     * @param weddingDate сущность свадебный день
     */
    public void save(LocalDate localDate, WeddingDate weddingDate) {
        weddingDateMap.put(localDate, weddingDate);
    }
}
