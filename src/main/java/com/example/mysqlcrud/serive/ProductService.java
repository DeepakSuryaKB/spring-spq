package com.example.mysqlcrud.serive;

import com.example.mysqlcrud.entity.Product;
import com.example.mysqlcrud.entity.Reviews;
import com.example.mysqlcrud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> saveProducts(List<Product> products){





        return  repository.saveAll(products);
    }

    public Product saveProduct(Product product){
        Reviews reviews1 = new Reviews();
        reviews1.setText("hello");
        List<Reviews> rev = new ArrayList<>();
        rev.add(reviews1);

       // Product pro = new Product();
       // pro.setQauntity(product.getQauntity());
        //product.setReviews(rev);

        return  repository.save(product);
    }

    public List<Product> getProduct(){
        return  repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public Product getProductByName(String name){
        return repository.findByName(name);
    }

    public String deleteProduct(int id){
        repository.deleteById(id);
        return "product is romeved";
    }
    public Product updateProduct(Product product){
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQauntity(product.getQauntity());

        return repository.save(existingProduct);
    }
}
