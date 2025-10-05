package com.autowireByName;

public class Specifications {

    private String carName;

    private String modelName;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Specifications{" +
                "carName='" + carName + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
