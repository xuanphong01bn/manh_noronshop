package com.example.noronshop.data.response;

import lombok.Data;

@Data
public class BillDetailResponse {
    private int bill_id;
    private int product_id;
    private int quanty;
    private double totalPrice;
}
