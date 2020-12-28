package com.amethikirana.AmethiKirana.Product.Repository;

import com.amethikirana.AmethiKirana.Product.Model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductModel, Integer> {
    Optional<List<ProductModel>> findByCategoryName(String categoryName);
    Optional<List<ProductModel>> findByTagName(String tagName);
    Optional<List<ProductModel>> findByProductSellerId(String productSellerId);
    @Query("SELECT A.PRODUCT_NAME FROM PRODUCT_MODEL WHERE A.PRODUCT_SELLER_ID = :SELLER")
    Optional<List<String>> findProductsBySeller(@Param("SELLER") String seller);
}
