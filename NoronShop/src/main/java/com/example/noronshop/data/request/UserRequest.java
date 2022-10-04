package com.example.noronshop.data.request;

import lombok.Data;

import java.util.Date;

@Data
public class UserRequest {
    private String name;
    private String email;
    private String phone;
    private String password;
    private double money;
    private Date create_at;
}
