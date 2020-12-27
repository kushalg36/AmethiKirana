package com.amethikirana.AmethiKirana.Product.Service;

import com.amethikirana.AmethiKirana.Product.Model.ProductModel;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public void addProduct(ProductModel productModel);

    public void updateProduct(ProductModel productModel, Integer Id);

    public void deleteProduct(ProductModel productModel, Integer Id);

    public Optional<ProductModel> getProductWithId(Integer Id);

    public Optional<List<ProductModel>> getProductWithCategory(String category);

    public Optional<List<ProductModel>> getProductWithTag(String product);

    public Optional<List<ProductModel>> getProductWithSellerId(String productSellerId);
}
