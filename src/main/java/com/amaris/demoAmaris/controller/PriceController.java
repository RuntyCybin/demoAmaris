package com.amaris.demoAmaris.controller;

import com.amaris.demoAmaris.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amaris.demoAmaris.dto.InputValuesDto;
import com.amaris.demoAmaris.dto.OutputValuesDto;

@RestController
public class PriceController {

    @Autowired
    PriceService priceService;

    @PostMapping("/consultPrices")
    public OutputValuesDto consultPrices(
            @RequestBody InputValuesDto inputValuesDto
    ) {
        return priceService.searchByInput(inputValuesDto);
    }
}

