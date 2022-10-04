package com.example.noronshop.data.data;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int product_id;
    private String author;
    private int number_sessions;

}
