package com.example.demo_afrv.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    private Integer stock;
    private Double costManufacturing;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}