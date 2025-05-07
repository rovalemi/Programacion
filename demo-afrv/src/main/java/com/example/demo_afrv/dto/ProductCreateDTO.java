package com.example.demo_afrv.dto;

import lombok.*;

@Getter
@Setter
public class ProductCreateDTO {

    private String name;
    private Double price;
    private Integer stock;
    private Double costManufacturing;
    private Long categoryId;
}