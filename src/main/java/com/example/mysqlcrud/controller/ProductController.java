package com.example.mysqlcrud.controller;

import com.example.mysqlcrud.entity.Product;
import com.example.mysqlcrud.serive.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return  productService.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return productService.getProduct();
    }

    @GetMapping("/product/{id}")
    public Product findById(@PathVariable int id){
        return  productService.getProductById(id);
    }

    @GetMapping("/productbyname/{name}")
    public Product findByname(@PathVariable String name){
        return  productService.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return  productService.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return  productService.deleteProduct(id);
    }

}
