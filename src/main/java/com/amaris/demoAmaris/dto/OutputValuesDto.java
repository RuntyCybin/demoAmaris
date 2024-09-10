package com.amaris.demoAmaris.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class OutputValuesDto {
    private int productId;
    private int cadenaId;
    private int tarifaId;
    private List<String> fechas;
    private int finalPrice;
}
