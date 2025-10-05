package com.setterInjection;

public class Specific {

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
        return "Specific{" +
                "carName='" + carName + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }

}
