package com.amaris.demoAmaris.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.amaris.demoAmaris.model.Price;

import java.util.Date;
import java.util.List;

@Repository
public interface PriceRepo extends CrudRepository<Price, Long> {

    @Query(value = "SELECT p " +
            "FROM Price p " +
            "WHERE p.startdate <= :prdate AND p.enddate >= :prdate " +
            "AND p.productID = :productid AND p.brandID = :brandid")
    public List<Price> findPriceByDto(@Param("prdate") Date date,
                                      @Param("productid") int prid,
                                      @Param("brandid") int brandid);
}
