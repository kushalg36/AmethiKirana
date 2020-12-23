package com.amethikirana.AmethiKirana.Product.Repository;

import com.amethikirana.AmethiKirana.Product.Model.ProductTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<ProductTag, Integer> {
}
