package com.segfault.model;

import java.util.List;

public class Order {
    Long OrderId;
    List<OrderEntity> orderEnitties;
    Integer totalQuantity;
    Double totalAmount;
    PaymentMethod paymentMethod;
    Customer customer;

    public Order() {
    }

    public Order(List<OrderEntity> orderEnitties, Integer totalQuantity, Double totalAmount, PaymentMethod paymentMethod, Customer customer) {
        this.orderEnitties = orderEnitties;
        this.totalQuantity = totalQuantity;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.customer = customer;
    }

    public Order(Long orderId, List<OrderEntity> orderEnitties, Integer totalQuantity, Double totalAmount, PaymentMethod paymentMethod, Customer customer) {
        OrderId = orderId;
        this.orderEnitties = orderEnitties;
        this.totalQuantity = totalQuantity;
        this.totalAmount = totalAmount;
        this.paymentMethod = paymentMethod;
        this.customer = customer;
    }

    public Long getOrderId() {
        return OrderId;
    }

    public void setOrderId(Long orderId) {
        OrderId = orderId;
    }

    public List<OrderEntity> getOrderEnitties() {
        return orderEnitties;
    }

    public void setOrderEnitties(List<OrderEntity> orderEnitties) {
        this.orderEnitties = orderEnitties;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
