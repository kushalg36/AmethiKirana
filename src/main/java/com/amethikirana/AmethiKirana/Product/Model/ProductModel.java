package com.amethikirana.AmethiKirana.Product.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private String productSellerId;
    private String productCostPrice;
    private String productSellPrice;
    private String tagId;
    private String categoryId;
    private Integer productCount;
    private Date productExpDate;
    private String productColor;
    private String productWeight;
    private Date sysCreationDate;
    private Date sysUpdateDate;

    public ProductModel() {
    }

    public ProductModel(String productName, String productSellerId, String productCostPrice, String productSellPrice, String tagId, String categoryId, Integer productCount, Date productExpDate, String productColor, String productWeight, Date sysCreationDate, Date sysUpdateDate) {
        this.productName = productName;
        this.productSellerId = productSellerId;
        this.productCostPrice = productCostPrice;
        this.productSellPrice = productSellPrice;
        this.tagId = tagId;
        this.categoryId = categoryId;
        this.productCount = productCount;
        this.productExpDate = productExpDate;
        this.productColor = productColor;
        this.productWeight = productWeight;
        this.sysCreationDate = sysCreationDate;
        this.sysUpdateDate = sysUpdateDate;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSellerId() {
        return productSellerId;
    }

    public void setProductSellerId(String productSellerId) {
        this.productSellerId = productSellerId;
    }

    public String getProductCostPrice() {
        return productCostPrice;
    }

    public void setProductCostPrice(String productCostPrice) {
        this.productCostPrice = productCostPrice;
    }

    public String getProductSellPrice() {
        return productSellPrice;
    }

    public void setProductSellPrice(String productSellPrice) {
        this.productSellPrice = productSellPrice;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public Date getProductExpDate() {
        return productExpDate;
    }

    public void setProductExpDate(Date productExpDate) {
        this.productExpDate = productExpDate;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        this.productWeight = productWeight;
    }

    public Date getSysCreationDate() {
        return sysCreationDate;
    }

    public void setSysCreationDate(Date sysCreationDate) {
        this.sysCreationDate = sysCreationDate;
    }

    public Date getSysUpdateDate() {
        return sysUpdateDate;
    }

    public void setSysUpdateDate(Date sysUpdateDate) {
        this.sysUpdateDate = sysUpdateDate;
    }
}
