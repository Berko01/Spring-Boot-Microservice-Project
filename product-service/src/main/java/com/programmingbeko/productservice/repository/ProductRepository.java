package com.programmingbeko.productservice.repository;

import com.programmingbeko.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface ProductRepository extends MongoRepository<Product, String> {

}
