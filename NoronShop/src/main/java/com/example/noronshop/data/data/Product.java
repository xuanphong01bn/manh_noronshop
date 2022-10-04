package com.example.noronshop.data.data;

import com.example.noronshop.data.data.CategoryProduct;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    private String img;
    private int totalView;
    private  double price;
    private int sellNumber;
    private  int quanty;
    private double new_product;
    private String description;
    private Date create_at;
    private int categoryProduct_id;

    @ManyToOne
    @JoinColumn(name = "categoryProduct_id",insertable=false, updatable=false)
    private CategoryProduct categoryProduct;
}
