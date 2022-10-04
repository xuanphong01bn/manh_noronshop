package com.example.noronshop.data.data;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "billDetail")
public class BillDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int bill_id;
    private int product_id;
    private int quanty;
    private double totalPrice;
}
