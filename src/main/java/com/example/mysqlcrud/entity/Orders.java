package com.example.mysqlcrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDERS_TBL")
public class Orders {

    @Id
    @GeneratedValue
    private int id;
    private  String orderName;
    private Date createdAt = new Date();
    private double price;
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "order_products" ,
            joinColumns = {
            @JoinColumn(name = "orders_id")},
            inverseJoinColumns = {
            @JoinColumn(name = "product_id")
    })
    private List<Product> products= new ArrayList<>();

}
