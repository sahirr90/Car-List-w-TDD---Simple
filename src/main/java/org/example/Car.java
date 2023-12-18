package org.example;
import java.util.ArrayList;

public class Car {

    private String carName;
    private CarLot carLot;

    public Car (String carName) {
        this.carName = carName;
    }


    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public CarLot getCarLot() {
        return carLot;
    }

    public void setCarLot(CarLot carLot) {
        this.carLot = carLot;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Car name: %s", carName));
        return builder.toString();
    }







}
