package com.example.onlinewaiter.data.model.restoModels;

import java.io.Serializable;

public class FoodModel implements Serializable {
    private int id;
    private String name;
    private String description;
    private double price;
    private double volume;
    private int foodTypeId;
    private int resto_id;

    public FoodModel(int id, String name, String description, double price, double volume, int foodTypeId, int resto_id) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.volume = volume;
        this.foodTypeId = foodTypeId;
        this.resto_id = resto_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodTypeId(int foodTypeId) {
        this.foodTypeId = foodTypeId;
    }

    public int getResto_id() {
        return resto_id;
    }

    public void setResto_id(int resto_id) {
        this.resto_id = resto_id;
    }
}
