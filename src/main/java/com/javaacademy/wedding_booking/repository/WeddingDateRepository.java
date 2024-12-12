package com.javaacademy.wedding_booking.repository;

import com.javaacademy.wedding_booking.entity.WeddingDate;
import com.javaacademy.wedding_booking.storage.WeddingDateStorage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class WeddingDateRepository {
    private final WeddingDateStorage weddingDateStorage;

    /**
     * Возвращает список забронированных дней в заданном месяце
     *
     * @param month месяц
     * @return список забронированных дней
     */
    public List<WeddingDate> getAllWeddingDateOfMonth(Integer month) {
        return weddingDateStorage.getAllWeddingDateOfMonth(month);
    }

    /**
     * Возвращает количество забронированных дней в заданном месяце
     *
     * @param month месяц
     * @return количество забронированных дней
     */
    public Long getSumAllWeddingDateOfMonth(Integer month) {
        return weddingDateStorage.getSumAllWeddingDateOfMonth(month);
    }

    /** Метод записи бронированной даты
     * @param localDate   Дата бронирования
     * @param weddingDate сущность свадебный день
     */
    public void save(LocalDate localDate, WeddingDate weddingDate) {
        weddingDateStorage.save(localDate, weddingDate);
    }
}
