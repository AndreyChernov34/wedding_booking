package com.javaacademy.wedding_booking.service;

import com.javaacademy.wedding_booking.dto.CountDto;
import com.javaacademy.wedding_booking.dto.WeddingDateDto;
import com.javaacademy.wedding_booking.entity.WeddingDate;
import com.javaacademy.wedding_booking.mapper.WeddingDateMapper;
import com.javaacademy.wedding_booking.repository.WeddingDateRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class WeddingDateService {
    private final WeddingDateRepository weddingDateRepository;
    private final WeddingDateMapper weddingDateMapper;
    @Value("${year}")
    private Integer year;

    /**
     * Метод возвращает список забронированных дней в заданном месяце
     *
     * @param month месяц
     * @return список забронированных дней
     */
    public List<WeddingDateDto> getAllWeddingDateOfMonth(Integer month) {
        return weddingDateRepository.getAllWeddingDateOfMonth(month).stream().map(weddingDateMapper::convert).toList();
    }

    /**
     * Метод возвращает количество забронированных дней в заданном месяце
     *
     * @param month месяц
     * @return количество забронированных дней
     */
    public CountDto getSumAllWeddingDateOfMonth(Integer month) {
        return new CountDto(weddingDateRepository.getSumAllWeddingDateOfMonth(month));
    }

    /**
     * Метод записи бронированной даты
     *
     * @param month месяц
     * @param day   день
     */
    public void save(Integer month, Integer day) {
        weddingDateRepository.save(LocalDate.of(year, month, day), new WeddingDate(month, day));
    }

}
