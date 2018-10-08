package com.segfault.model;

import com.segfault.model.enums.AddressType;

public class Address {
    Long addressId;
    Long pincode;
    String houseNumber;
    String houseName;
    String streetArea;
    String landmark;
    String townCity;
    String state;
    AddressType addresstype;

    public Address() {
    }

    public Address(Long pincode, String houseNumber, String houseName, String streetArea, String landmark, String townCity, String state, AddressType addresstype) {
        this.pincode = pincode;
        this.houseNumber = houseNumber;
        this.houseName = houseName;
        this.streetArea = streetArea;
        this.landmark = landmark;
        this.townCity = townCity;
        this.state = state;
        this.addresstype = addresstype;
    }

    public Address(Long addressId, Long pincode, String houseNumber, String houseName, String streetArea, String landmark, String townCity, String state, AddressType addresstype) {
        this.addressId = addressId;
        this.pincode = pincode;
        this.houseNumber = houseNumber;
        this.houseName = houseName;
        this.streetArea = streetArea;
        this.landmark = landmark;
        this.townCity = townCity;
        this.state = state;
        this.addresstype = addresstype;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getStreetArea() {
        return streetArea;
    }

    public void setStreetArea(String streetArea) {
        this.streetArea = streetArea;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getTownCity() {
        return townCity;
    }

    public void setTownCity(String townCity) {
        this.townCity = townCity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public AddressType getAddresstype() {
        return addresstype;
    }

    public void setAddresstype(AddressType addresstype) {
        this.addresstype = addresstype;
    }
}
