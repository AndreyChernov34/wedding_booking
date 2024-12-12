package com.javaacedemy.wedding_booking.controller;

import com.javaacedemy.wedding_booking.dto.WeddingDateDto;
import com.javaacedemy.wedding_booking.service.WeddingDateService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class WeddingDateController {
    private final WeddingDateService weddingDateService;

    @GetMapping("/booking/month/{month}")
    public List<WeddingDateDto> getAllWeddingDateOfMonth(@PathVariable Integer month) {
        return weddingDateService.getAllWeddingDateOfMonth(month);
    }

    @GetMapping("/month/{month}/free")
    public Integer getSumAllWeddingDateOfMonth(@PathVariable Integer month) {
        return weddingDateService.getSumAllWeddingDateOfMonth(month);
    }

    @PostMapping("/booking")
    public void saveWeddingDate(@RequestParam Integer month, @RequestParam Integer day) {
        weddingDateService.save(month, day);
    }



}
