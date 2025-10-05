package com.autowireByType;

public class Specification {

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
        return "Specification{" +
                "carName='" + carName + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
