package com.example.noronshop.data.request;

import lombok.Data;

import java.util.Date;

@Data
public class ProductRequest {
    private  int id;
    private String name;
    private String img;
    private int totalView;
    private  double price;
    private int sellNumber;
    private  int quanty;
    private double new_product;
    private String description;
    private Date create_at;
    private int categoryProduct_id;

}