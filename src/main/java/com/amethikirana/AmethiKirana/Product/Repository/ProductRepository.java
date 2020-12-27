package com.amethikirana.AmethiKirana.Product.Repository;

import com.amethikirana.AmethiKirana.Product.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
    Optional<List<ProductModel>> findByCategoryName(String categoryName);
    Optional<List<ProductModel>> findByTagName(String tagName);
    Optional<List<ProductModel>> findByProductSellerId(String productSellerId);
}
