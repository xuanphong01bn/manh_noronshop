package com.example.noronshop.data.response;

import lombok.Data;

import java.util.Date;
@Data
public class BillResponse {
    private int user_id;
    private String name;
    private String email;
    private String phone;
    private String city;
    private String district;
    private String houseNumber;
    private String note;
    private Date create_at;
    private int quanty;
    private double totalPrice;
}
