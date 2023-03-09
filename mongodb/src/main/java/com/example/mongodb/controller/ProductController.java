package com.example.mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongodb.model.Product;
import com.example.mongodb.model.repository.ProductRepository;
import com.example.mongodb.resource.ProductRequest;

@RestController
public class ProductController {

    private final ProductRepository productRepository;

        public ProductController(ProductRepository productRepository){
            this.productRepository = productRepository;
        }
    @CrossOrigin(origins = "http//localhost:8080")
    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(this.productRepository.findAll());

    }

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest productRequest) {

        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());

        // if successful return 201 status 
        return ResponseEntity.status(201).body(this.productRepository.save(product));

    }

    // id refers to object id
    @GetMapping("/product/{id}")
    public ResponseEntity getAllProductById(@PathVariable String id) {

        Optional<Product> product = this.productRepository.findById(id);

        if(product.isPresent()) {
            return ResponseEntity.ok(product.get());
        } else{
            return ResponseEntity.ok("The product with id " + id + " was not found");
        }

    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity deleteProductById(@PathVariable String id) {
        
        Optional<Product> product = this.productRepository.findById(id);

        if(product.isPresent()) {
            this.productRepository.deleteById(id);
            return ResponseEntity.ok("Success.");
        } else {
            return ResponseEntity.ok("The product with id " + id + " was not found");
        }
    }
    
}
