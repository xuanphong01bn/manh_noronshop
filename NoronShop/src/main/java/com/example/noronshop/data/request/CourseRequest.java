package com.example.noronshop.data.request;

import lombok.Data;

@Data
public class CourseRequest {
    private int product_id;
    private String author;
    private int number_sessions;
}
