package com.autowireByType;

public class Car {

    Specification specification ;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayCar(){
       System.out.println(specification.toString());
   }
}
