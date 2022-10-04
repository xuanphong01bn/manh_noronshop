package com.example.noronshop.data.data;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoryProduct")
@Data
public class CategoryProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "category_id")
    private  int category_id;

    @Column(name = "name")
    private  String name;

    @Column(name = "decription")
    private  String description;

    @ManyToOne
    @JoinColumn(name = "category_id",insertable=false, updatable=false)
    private Category category;

    @OneToMany(mappedBy = "categoryProduct", fetch = FetchType.LAZY)
    private List<Product> products;

}
