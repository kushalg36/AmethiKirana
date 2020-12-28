package com.amethikirana.AmethiKirana.Product.Resource;

import com.amethikirana.AmethiKirana.Product.Model.ProductModel;
import com.amethikirana.AmethiKirana.Product.Service.ProductService;
import com.amethikirana.AmethiKirana.User.Model.userModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductResource {
    @Autowired
    ProductService productService;

    @PostMapping("/products")
    public void AddProduct(@RequestBody ProductModel productModel, Authentication authentication) {
        userModel user =(userModel) authentication.getPrincipal();
        productModel.setProductSellerId(String.valueOf(user.getUserId()));
        productService.addProduct(productModel);
    }

    @PutMapping("/{Id}")
    public void UpdateProduct(@RequestBody ProductModel productModel, @PathVariable Integer Id) {
        productService.updateProduct(productModel, Id);
    }

    @DeleteMapping("/{Id}")
    public void DeleteProduct(@RequestBody ProductModel productModel,@PathVariable Integer Id ) {
        productService.deleteProduct(productModel, Id);
    }

    @GetMapping("/{Id}")
    public Optional<ProductModel> getProductWithId(@PathVariable Integer Id) {
        return productService.getProductWithId(Id);
    }

    @GetMapping("/category/{category}")
    public Optional<List<ProductModel>> getProductWithCategory(@PathVariable String category) {
        return productService.getProductWithCategory(category);
    }

    @GetMapping("/tag   /{tag}")
    public Optional<List<ProductModel>> getProductWithTag(@PathVariable String tag) {
        return productService.getProductWithTag(tag);
    }

    @GetMapping("/seller/{sellerId}")
    public Optional<List<ProductModel>> getProductWithSellerId(@PathVariable String sellerId) {
        return productService.getProductWithSellerId(sellerId);
    }
}
