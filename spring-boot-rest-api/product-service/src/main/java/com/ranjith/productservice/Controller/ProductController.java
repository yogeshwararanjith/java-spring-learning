package com.ranjith.productservice.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranjith.productservice.Model.Product;
import com.ranjith.productservice.Service.ProductService;

import jakarta.validation.Valid;

@CrossOrigin(origins =  "http://localhost:4200")
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        // return productService.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
        return productService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product){
        Product created = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @Valid @RequestBody Product product){
        // return productService.updateProduct(id, product).map(ResponseEntity::ok).
        // orElse(ResponseEntity.notFound().build());
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public Product deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

}
