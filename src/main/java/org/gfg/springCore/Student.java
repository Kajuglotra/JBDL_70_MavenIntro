package org.gfg.springCore;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private String name;

    private Address address;

    public Student() {
        System.out.println("I am in default constructor of student class ");
    }

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("I am setter of name");
        this.name = name;
    }

    public Address getAddress() {

        return address;
    }

    public void setAddress(Address address) {
        System.out.println("I am setter of address");
        this.address = address;
    }

    public void initMethod(){
        System.out.println("I am in init method");
    }
    public void destroyMethod(){
        System.out.println("I am in destroy method");
    }
}
