package com.example.noronshop.data.data;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int product_id;
    private String issuing_company;
    private String publication_date;
    private String translator;
    private String coverType;
    private int numberPages;
    private int sku;
    private String publishing_company;
    private double width;
    private double height;
    private String unit;


}
