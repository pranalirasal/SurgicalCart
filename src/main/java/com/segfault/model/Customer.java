package com.segfault.model;

import java.util.List;

public class Customer {
    Long CustomerId;
    User customer;
    Address shippingAddress;
    Address billingAddress;
    List<Order> orders;

    public Customer() {
    }

    public Customer(User customer, Address shippingAddress, Address billingAddress, List<Order> orders) {
        this.customer = customer;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.orders = orders;
    }

    public Customer(Long customerId, User customer, Address shippingAddress, Address billingAddress, List<Order> orders) {
        CustomerId = customerId;
        this.customer = customer;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.orders = orders;
    }

    public Long getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Long customerId) {
        CustomerId = customerId;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
