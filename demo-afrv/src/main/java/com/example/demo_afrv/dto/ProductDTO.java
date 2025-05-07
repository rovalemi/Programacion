package com.example.demo_afrv.dto;

import lombok.*;

@Getter
@Setter
public class ProductDTO {

    private Long id;
    private String name;
    private Double price;

    private String categoryName;
}