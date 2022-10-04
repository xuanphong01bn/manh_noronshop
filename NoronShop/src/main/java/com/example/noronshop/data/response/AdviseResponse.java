package com.example.noronshop.data.response;

import lombok.Data;

import java.util.Date;
@Data
public class AdviseResponse {
    private int product_id;
    private String experts;
    private Date time;
    private String form;
}
