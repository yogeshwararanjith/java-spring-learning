package com.ranjith.productservice.Service;

import org.springframework.stereotype.Service;

import com.ranjith.productservice.Model.Product;
import com.ranjith.productservice.Repository.ProductRepository;
import com.ranjith.productservice.exception.ProductNotFoundException;

import java.util.List;

@Service
public class ProductService {

//     private final ProductStore productStore;

//     public ProductService(ProductStore productStore){
//         this.productStore = productStore;
//     }

//     public List<Product> findAll(){
//         return productStore.findAll();
//     }

//     public Product findById(int id){
//         return productStore.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
//     }

//     public Product createProduct(Product product){
//         return productStore.save(product);
//     }   

//     public Product updateProduct(int id, Product product){
//         return productStore.update(id, product).orElseThrow(() -> new ProductNotFoundException(id));
//     }

//     public Product deleteProduct(int id){
//         return productStore.delete(id).orElseThrow(() -> new ProductNotFoundException(id));
//    }

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(int id){
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }

    public Product createProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(int id, Product product){
        Product existing = findById(id);
        existing.setTitle(product.getTitle());
        existing.setCategory(product.getCategory());
        existing.setPrice(product.getPrice());
        existing.setRating(product.getRating());
        return productRepository.save(existing);
    }

    public Product deleteProduct(int id){
        Product existing = findById(id);
        productRepository.delete(existing);
        return existing;
    }

}
