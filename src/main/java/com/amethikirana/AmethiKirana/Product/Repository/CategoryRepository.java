package com.amethikirana.AmethiKirana.Product.Repository;

import com.amethikirana.AmethiKirana.Product.Model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<ProductCategory, Integer> {
}
