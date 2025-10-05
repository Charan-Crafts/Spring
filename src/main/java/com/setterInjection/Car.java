package com.setterInjection;

public class Car {

    Specific specification ;

    public void setSpecification(Specific specification) {
        this.specification = specification;
    }

    public void displayCar(){
        System.out.println("Car Name : "+specification.getCarName()+" Model Name : "+specification.getModelName());
    }

}
