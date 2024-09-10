package com.amaris.demoAmaris.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amaris.demoAmaris.model.Price;
import com.amaris.demoAmaris.repository.PriceRepo;

@Service
public class PriceService {
    
    private PriceRepo priceRepo;

    @Autowired
    public PriceService(PriceRepo pricerepo) {
        this.priceRepo = pricerepo;
    }

    public Price savePrice(Price price) {
        return priceRepo.save(price);
    }
}
