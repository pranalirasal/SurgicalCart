package com.segfault.model;

import java.util.List;

public class Cart {
    Long CartId;
    Customer customer;
    List<OrderEntity> orderEntities;
    Integer totalQuantity;
    Double totalAmount;

    public Cart() {
    }

    public Cart(Customer customer, List<OrderEntity> orderEntities, Integer totalQuantity, Double totalAmount) {
        this.customer = customer;
        this.orderEntities = orderEntities;
        this.totalQuantity = totalQuantity;
        this.totalAmount = totalAmount;
    }

    public Cart(Long cartId, Customer customer, List<OrderEntity> orderEntities, Integer totalQuantity, Double totalAmount) {
        CartId = cartId;
        this.customer = customer;
        this.orderEntities = orderEntities;
        this.totalQuantity = totalQuantity;
        this.totalAmount = totalAmount;
    }

    public Long getCartId() {
        return CartId;
    }

    public void setCartId(Long cartId) {
        CartId = cartId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderEntity> getOrderEntities() {
        return orderEntities;
    }

    public void setOrderEntities(List<OrderEntity> orderEntities) {
        this.orderEntities = orderEntities;
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
