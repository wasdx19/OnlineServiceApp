package com.example.onlinewaiter.data.model.restaurant;

import java.util.List;

public class Drink {
    private int id;
    private String name;
    private String description;
    private String volume;
    private double price;
    private List<String> imageUrl;
    private int drinkTypeId;
    private List<Integer> restourantIdList;
    private boolean recomendation;

    public Drink() {
    }

    public Drink(int id, String name, String description, String volume, double price, List<String> imageUrl, int drinkTypeId, List<Integer> restourantIdList, boolean recomendation) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.volume = volume;
        this.price = price;
        this.imageUrl = imageUrl;
        this.drinkTypeId = drinkTypeId;
        this.restourantIdList = restourantIdList;
        this.recomendation = recomendation;
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

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(List<String> imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getDrinkTypeId() {
        return drinkTypeId;
    }

    public void setDrinkTypeId(int drinkTypeId) {
        this.drinkTypeId = drinkTypeId;
    }

    public List<Integer> getRestourantIdList() {
        return restourantIdList;
    }

    public void setRestourantIdList(List<Integer> restourantIdList) {
        this.restourantIdList = restourantIdList;
    }

    public boolean isRecomendation() {
        return recomendation;
    }

    public void setRecomendation(boolean recomendation) {
        this.recomendation = recomendation;
    }
}
