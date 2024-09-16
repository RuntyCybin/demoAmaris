package com.amaris.demoAmaris.dto;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InputValuesDto {
    private Date fecha;
    private int productId;
    private int cadenaId;
}