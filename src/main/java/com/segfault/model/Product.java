package com.segfault.model;

import com.segfault.model.enums.ProductCategory;
import com.segfault.model.enums.ProductStatus;

public class Product {
    Long productId;
    String productName;
    String productDescription;
    Long price;
    Review review;
    ProductCategory category;
    ProductStatus status;

    public Product() {
    }

    public Product(String productName, String productDescription, Long price, Review review, ProductCategory category, ProductStatus status) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.review = review;
        this.category = category;
        this.status = status;
    }

    public Product(Long productId, String productName, String productDescription, Long price, Review review, ProductCategory category, ProductStatus status) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.review = review;
        this.category = category;
        this.status = status;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }
}
