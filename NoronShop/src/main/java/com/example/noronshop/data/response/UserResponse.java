package com.example.noronshop.data.response;

import lombok.Data;

import java.util.Date;
@Data
public class UserResponse {
    private String name;
    private String email;
    private String phone;
    private String password;
    private double money;
    private Date create_at;
}
