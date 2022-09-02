package com.example.mysqlcrud.controller;

import com.example.mysqlcrud.entity.Orders;
import com.example.mysqlcrud.serive.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Orders> getAllOrders(){
        return orderService.getAllOrders();
    }

    @PostMapping("/orders")
    public Orders saveOrders(Orders orders){
        return orderService.saveOrders(orders);
    }
}
