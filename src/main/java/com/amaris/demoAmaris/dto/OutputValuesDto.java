package com.amaris.demoAmaris.dto;

import java.util.Date;
import java.util.List;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OutputValuesDto {
    private int productId;
    private int cadenaId;
    private int tarifaId;
    private List<Date> fechas;
    private double finalPrice;
}
