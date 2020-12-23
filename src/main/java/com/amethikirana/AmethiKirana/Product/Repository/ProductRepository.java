package com.amethikirana.AmethiKirana.Product.Repository;

import com.amethikirana.AmethiKirana.Product.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

}
