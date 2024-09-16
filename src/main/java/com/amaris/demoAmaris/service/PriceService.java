package com.amaris.demoAmaris.service;

import com.amaris.demoAmaris.dto.InputValuesDto;
import com.amaris.demoAmaris.dto.OutputValuesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amaris.demoAmaris.model.Price;
import com.amaris.demoAmaris.repository.PriceRepo;

import java.util.Arrays;
import java.util.List;

@Service
public class PriceService {

    private PriceRepo priceRepo;

    @Autowired
    public PriceService(PriceRepo pricerepo) {
        this.priceRepo = pricerepo;
    }

    public OutputValuesDto searchByInput(InputValuesDto inputDto) {
        Price price = new Price();
        List<Price> resultListPrice = priceRepo.findPriceByDto(
                inputDto.getFecha(),
                inputDto.getProductId(),
                inputDto.getCadenaId());

        if (resultListPrice.size() > 1) {
            price = resultListPrice.stream()
                    .filter(precio -> precio.getPriority() == 1)
                    .findAny()
                    .orElse(null);
        } else {
            price = resultListPrice.get(0);
        }

        OutputValuesDto outputValuesDto = new OutputValuesDto();
        outputValuesDto.setCadenaId(price.getBrandID());
        outputValuesDto.setTarifaId(price.getPricelistID());
        outputValuesDto.setFinalPrice(price.getPrice());
        outputValuesDto.setProductId(price.getProductID());
        outputValuesDto.setFechas(Arrays.asList(price.getStartdate(), price.getEnddate()));

        return outputValuesDto;
    }
}
