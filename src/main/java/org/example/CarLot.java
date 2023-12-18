package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarLot {
    private final List<String> cars;
    public CarLot(){
        this.cars = new ArrayList<>();
    }
    public void addCar(String car){
        cars.add(car);
    }
    public void removeCar(String car){cars.remove(car);}
    public void displayCars(){
        System.out.println("Cars that are in the lot:");
        for(String car : cars){
            System.out.println(car);
        }
    }
    public List<String> getCars(){
        return cars;
    }


}