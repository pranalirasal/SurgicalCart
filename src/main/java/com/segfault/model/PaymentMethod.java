package com.segfault.model;

public class PaymentMethod {
    Long paymentMethodId;
    String paymentMethodName;
    String paymentDetails;

    public PaymentMethod() {
    }

    public PaymentMethod(String paymentMethodName, String paymentDetails) {
        this.paymentMethodName = paymentMethodName;
        this.paymentDetails = paymentDetails;
    }

    public PaymentMethod(Long paymentMethodId, String paymentMethodName, String paymentDetails) {
        this.paymentMethodId = paymentMethodId;
        this.paymentMethodName = paymentMethodName;
        this.paymentDetails = paymentDetails;
    }

    public Long getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(Long paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }
}
