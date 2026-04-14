package com.ranjith.productservice.Service;

import org.springframework.stereotype.Service;

import com.ranjith.productservice.Model.Product;
import com.ranjith.productservice.Repository.ProductStore;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductStore productStore;

    public ProductService(ProductStore productStore){
        this.productStore = productStore;
    }

    public List<Product> findAll(){
        return productStore.findAll();
    }

    public Optional<Product> findById(int id){
        return productStore.findById(id);
    }

    public Product createProduct(Product product){
        return productStore.save(product);
    }   

    public Optional<Product> updateProduct(int id, Product product){
        return productStore.update(id, product);
    }

    public Optional<Product> deleteProduct(int id){
        return productStore.delete(id);
    }
}
