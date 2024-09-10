package com.amaris.demoAmaris.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.amaris.demoAmaris.model.Price;

@Repository
public interface PriceRepo extends CrudRepository<Price, Long> {
}
