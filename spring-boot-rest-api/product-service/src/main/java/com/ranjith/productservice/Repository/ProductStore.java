package com.ranjith.productservice.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Repository;

import com.ranjith.productservice.Model.Product;

@Repository
public class ProductStore {

    // private final List<Product> products = new ArrayList<>();

    private final Map<Integer, Product> products = new HashMap<>();

    private final AtomicInteger idGenerator = new AtomicInteger(3);


    public ProductStore(){
        products.put(1, new Product(1, "Essence Mascara Lash Princess", "beauty", 9.99, 4.5));
        products.put(2, new Product(2, "Eyeshadow Palette with Mirror", "beauty", 19.99, 4.2));
        products.put(3,new Product(3, "Powder Canister", "beauty", 14.99, 4.0));    
    }
    

    public List<Product> findAll(){
        return new ArrayList<>(products.values());
    }

    public Optional<Product> findById(int id){
        // return findAll().stream().filter(prdct -> prdct.getId().equals(id)).findFirst();
        return Optional.ofNullable(products.get(id));
    }

    public Product save(Product product){
        // Integer nextId = findAll().stream().mapToInt(Product::getId).max().orElse(1)+1; 
        Integer nextId = idGenerator.incrementAndGet();
        product.setId(nextId);      
        products.put(nextId,product);
        return product;         
    }

    public Optional<Product> update(int id, Product product){
    //    for(Product existing : findAll()){
    //         if(existing.getId().equals(id)){
    //             existing.setTitle(product.getTitle());
    //             existing.setCategory(product.getCategory());
    //             existing.setPrice(product.getPrice());
    //             existing.setRating(product.getRating());
    //             return Optional.of(existing);
    //         }
    //    }
    //    return Optional.empty();
    if(products.containsKey(id)){
        Product existing = products.get(id);
            existing.setTitle(product.getTitle());
            existing.setCategory(product.getCategory());
            existing.setPrice(product.getPrice());
            existing.setRating(product.getRating());
        
        return Optional.of(existing);
    }
    return Optional.empty();
    }

    public Optional<Product> delete(int id){
        Optional<Product> findProduct = findById(id);
        findProduct.ifPresent(prdct -> products.remove(id, prdct));
        return findProduct;
    }

}
