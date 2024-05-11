package org.gfg.springCore;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String city;

    private int pincode;

    public Address() {
        System.out.println("I am in default constructor of address class ");

    }

    public Address(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        System.out.println("I am setter of city");
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        System.out.println("I am setter of pincode");
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
