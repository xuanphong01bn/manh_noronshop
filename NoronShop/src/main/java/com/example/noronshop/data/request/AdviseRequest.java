package com.example.noronshop.data.request;

import lombok.Data;

import java.util.Date;

@Data
public class AdviseRequest {
    private int product_id;
    private String experts;
    private Date time;
    private String form;
}
