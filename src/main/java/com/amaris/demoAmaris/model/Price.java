package com.amaris.demoAmaris.model;

import java.util.Date;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prices")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int brandID;

    @Column
    private Date startdate;

    @Column
    private Date enddate;

    @Column
    private int pricelistID;

    @Column
    private int productID;

    @Column
    private int priority;

    @Column
    private double price;

    @Column
    private String curr;
}
