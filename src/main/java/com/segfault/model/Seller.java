package com.segfault.model;

public class Seller {
    Long SellerId;
    User seller;
    Address StoreAddress;

    public Seller() {
    }

    public Seller(User seller, Address storeAddress) {
        this.seller = seller;
        StoreAddress = storeAddress;
    }

    public Seller(Long sellerId, User seller, Address storeAddress) {
        SellerId = sellerId;
        this.seller = seller;
        StoreAddress = storeAddress;
    }

    public Long getSellerId() {
        return SellerId;
    }

    public void setSellerId(Long sellerId) {
        SellerId = sellerId;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Address getStoreAddress() {
        return StoreAddress;
    }

    public void setStoreAddress(Address storeAddress) {
        StoreAddress = storeAddress;
    }
}
