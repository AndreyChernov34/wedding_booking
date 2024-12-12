package com.javaacedemy.wedding_booking.service;

import com.javaacedemy.wedding_booking.dto.WeddingDateDto;
import com.javaacedemy.wedding_booking.entity.WeddingDate;
import com.javaacedemy.wedding_booking.mapper.WeddingDateMapper;
import com.javaacedemy.wedding_booking.repository.WeddingDateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WeddingDateService {
    private final WeddingDateRepository weddingDateRepository;
    private final WeddingDateMapper weddingDateMapper;

    @Value("${year}")
    private final Integer year;

    public List<WeddingDateDto> getAllWeddingDateOfMonth(Integer month) {
        return weddingDateRepository.getAllWeddingDateOfMonth(month).stream().
                map(weddingDate -> weddingDateMapper.convert(weddingDate)).toList();
    }

    public Integer getSumAllWeddingDateOfMonth(Integer month) {
        return weddingDateRepository.getSumAllWeddingDateOfMonth(month);
    }

    public void save(Integer month, Integer day) {
        WeddingDate weddingDate = new WeddingDate(month, day);
        weddingDateRepository.save(LocalDate.of(year, month, day), weddingDate);
    }

}
