package com.amethikirana.AmethiKirana.Product.Service;


import com.amethikirana.AmethiKirana.Exception.AuthException;
import com.amethikirana.AmethiKirana.Product.Model.ProductModel;
import com.amethikirana.AmethiKirana.Product.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public void addProduct(ProductModel productModel) {
        Optional<List<String>> productsBySeller = productRepository.findProductsBySeller(productModel.getProductSellerId());
        String newProduct = productModel.getProductName();
        long countOfExistingProdBySeller = productsBySeller.stream().filter(s -> s.equals(newProduct)).count();
        if(countOfExistingProdBySeller>0) {
            throw new AuthException("Item already exists in the warehouse");
        }
        productRepository.save(productModel);
    }

    @Override
    public void updateProduct(ProductModel productModel, Integer Id) {
        productRepository.save(productModel);
    }

    @Override
    public void deleteProduct(ProductModel productModel, Integer Id) {
        productRepository.deleteById(Id);
    }

    @Override
    public Optional<ProductModel> getProductWithId(Integer Id) {
        Optional<ProductModel> productById = productRepository.findById(Id);
        return productById;
    }

    @Override
    public Optional<List<ProductModel>> getProductWithCategory(String category) {
        Optional<List<ProductModel>> productByCategory = productRepository.findByCategoryName(category);
        return productByCategory;
    }

    @Override
    public Optional<List<ProductModel>> getProductWithTag(String tag) {
        Optional<List<ProductModel>> productByTag = productRepository.findByTagName(tag);
        return productByTag;
    }

    @Override
    public Optional<List<ProductModel>> getProductWithSellerId(String productSellerId) {
        Optional<List<ProductModel>> productBySellerId = productRepository.findByProductSellerId(productSellerId);
        return productBySellerId;
    }
}
