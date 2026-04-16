package com.ranjith.productservice.Service;

import org.springframework.stereotype.Service;

import com.ranjith.productservice.Model.Product;
import com.ranjith.productservice.Repository.ProductStore;
import com.ranjith.productservice.exception.ProductNotFoundException;

import java.util.List;

@Service
public class ProductService {

    private final ProductStore productStore;
    

    public ProductService(ProductStore productStore){
        this.productStore = productStore;
    }

    public List<Product> findAll(){
        return productStore.findAll();
    }

    public Product findById(int id){
        return productStore.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public Product createProduct(Product product){
        return productStore.save(product);
    }   

    public Product updateProduct(int id, Product product){
        return productStore.update(id, product).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public Product deleteProduct(int id){
        return productStore.delete(id).orElseThrow(() -> new ProductNotFoundException(id));
   }
}
