package com.example.noronshop.data.data;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "bill")
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
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