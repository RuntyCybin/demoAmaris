package com.amaris.demoAmaris.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "prices")
public class Price {
    @Id
    private Long id;

    @Column
    private int brandID;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private int priceListID;

    @Column
    private int productID;

    @Column
    private int priority;

    @Column 
    private double price;

    @Column
    private String curr;
}
