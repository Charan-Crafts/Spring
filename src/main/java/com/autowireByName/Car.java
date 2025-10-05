package com.autowireByName;

public class Car {

    Specifications specification = new Specifications();

    public void setSpecification(Specifications specification) {
        this.specification = specification;
    }

    public void displayCarInfo(){
        System.out.println(specification.toString());
    }
}
