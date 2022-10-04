package com.example.noronshop.data.data;

import lombok.Data;
import org.jooq.Record;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "advise")
public class Advise implements Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int product_id;
    private String experts;
    private Date time;
    private String form;
}
