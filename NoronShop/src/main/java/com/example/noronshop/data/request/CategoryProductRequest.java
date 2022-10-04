package com.example.noronshop.data.request;

import lombok.Data;

@Data
public class CategoryProductRequest {

    private int category_id;

    private String name;

    private String description;

}
