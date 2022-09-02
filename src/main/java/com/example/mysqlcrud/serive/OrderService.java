package com.example.mysqlcrud.serive;

import com.example.mysqlcrud.entity.Orders;
import com.example.mysqlcrud.entity.Product;
import com.example.mysqlcrud.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrdersRepository ordersRepository;

    public Orders saveOrders(Orders orders){
        /*Orders order = new Orders();

        order.setOrderName("order1");
        order.setPrice(4000);
        Product pro = new Product();
        pro.setName("many to may pro");
        pro.setQauntity(400);
        pro.setPrice(800);
        List<Product> listofproduct = new ArrayList<>();
        listofproduct.add(pro);

        order.setProducts(listofproduct);*/


        return ordersRepository.save(orders);
    }

    public List<Orders> getAllOrders(){
        return ordersRepository.findAll();
    }
}
