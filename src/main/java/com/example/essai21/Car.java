package com.example.essai21;

public class Car {

    private String plateNumber;
    private int price;

    public Car(String plateNumber, int price) {
        this.plateNumber = plateNumber;
        this.price = price;
    }

    public Car() {
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
