package com.springboot.springbootmicroservices.repository;

import com.springboot.springbootmicroservices.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
