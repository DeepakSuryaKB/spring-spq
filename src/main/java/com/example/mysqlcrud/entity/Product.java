package com.example.mysqlcrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private  String name;
    private int qauntity;
    private double price;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name ="pc_fid",referencedColumnName = "id")
    List<Reviews> reviews = new ArrayList<>();
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "products")
    List<Orders> orders = new ArrayList<>();


}
