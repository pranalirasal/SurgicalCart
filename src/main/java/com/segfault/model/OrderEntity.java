package com.segfault.model;

public class OrderEntity {
    Long orderEntityId;
    Product product;
    Integer totalQuantity;
    Double totalAmount;

    public OrderEntity() {
    }

    public OrderEntity(Product product, Integer totalQuantity, Double totalAmount) {
        this.product = product;
        this.totalQuantity = totalQuantity;
        this.totalAmount = totalAmount;
    }

    public OrderEntity(Long orderEntityId, Product product, Integer totalQuantity, Double totalAmount) {
        this.orderEntityId = orderEntityId;
        this.product = product;
        this.totalQuantity = totalQuantity;
        this.totalAmount = totalAmount;
    }

    public Long getOrderEntityId() {
        return orderEntityId;
    }

    public void setOrderEntityId(Long orderEntityId) {
        this.orderEntityId = orderEntityId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
