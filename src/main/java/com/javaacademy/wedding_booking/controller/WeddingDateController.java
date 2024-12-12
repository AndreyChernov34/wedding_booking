package com.javaacademy.wedding_booking.controller;

import com.javaacademy.wedding_booking.dto.CountDto;
import com.javaacademy.wedding_booking.dto.InputDateDto;
import com.javaacademy.wedding_booking.dto.WeddingDateDto;
import com.javaacademy.wedding_booking.service.WeddingDateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/booking")
@Slf4j
@RequiredArgsConstructor
public class WeddingDateController {
    private final WeddingDateService weddingDateService;

    /**
     * Метод возвращает все бронированные даты в заданном месяце
     *
     * @param month заданный месяц
     * @return список бронированных дат
     */
    @GetMapping("/month/{month}")
    public List<WeddingDateDto> getAllWeddingDateOfMonth(@PathVariable Integer month) {
        return weddingDateService.getAllWeddingDateOfMonth(month);
    }

    /**
     * Метод возвращает количество забронированных дат в заданном месяце
     *
     * @param month заданный месяц
     * @return количество забронированных дат
     */
    @GetMapping("/month/{month}/free")
    public CountDto getSumAllWeddingDateOfMonth(@PathVariable Integer month) {
        return weddingDateService.getSumAllWeddingDateOfMonth(month);
    }

    /**
     * Метод записи бронированной даты
     *
     * @param inputDateDto Дата бронирования
     */
    @PostMapping
    public void saveWeddingDate(@RequestBody InputDateDto inputDateDto) {
        weddingDateService.save(inputDateDto.getMonth(), inputDateDto.getDay());
    }
}
