package com.test1.productmicroservice.controller;

import com.test1.productmicroservice.entity.ProductEntity;
import com.test1.productmicroservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired(required = true)
    private ProductRepository productRepository;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    private void createProduct(@RequestBody ProductEntity productEntity){
        productRepository.save(productEntity);
    }
}
