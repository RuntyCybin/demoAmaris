package com.amaris.demoAmaris.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amaris.demoAmaris.dto.InputValuesDto;
import com.amaris.demoAmaris.dto.OutputValuesDto;

@RestController
public class PriceController {

    @PostMapping("/test")
    public OutputValuesDto testMethod(
        @RequestBody InputValuesDto inputValuesDto
    ) {
        OutputValuesDto outputValuesDto = new OutputValuesDto();

        return outputValuesDto;
    }
    
}
