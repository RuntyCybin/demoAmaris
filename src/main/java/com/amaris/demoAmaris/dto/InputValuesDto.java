package com.amaris.demoAmaris.dto;

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
public class InputValuesDto {
    private String fecha;
    private int productId;
    private int cadenaId;
}
