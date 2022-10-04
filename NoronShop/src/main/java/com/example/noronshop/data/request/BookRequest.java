package com.example.noronshop.data.request;

import lombok.Data;

@Data
public class BookRequest {
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
