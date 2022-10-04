package com.example.noronshop.data.request;

import lombok.Data;

@Data
public class BillDetailRequest {
    private int bill_id;
    private int product_id;
    private int quanty;
    private double totalPrice;
}
