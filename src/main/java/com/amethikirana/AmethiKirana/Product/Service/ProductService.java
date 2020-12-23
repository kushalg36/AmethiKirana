package com.amethikirana.AmethiKirana.Product.Service;

import com.amethikirana.AmethiKirana.Product.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


}
