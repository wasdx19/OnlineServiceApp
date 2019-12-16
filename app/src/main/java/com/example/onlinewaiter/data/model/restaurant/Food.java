package com.example.onlinewaiter.data.model.restaurant;

import java.util.List;

public class Food {
    private int id;
    private String name;
    private String description;
    private double price;
    private List<String> imageUrl;
    private int foodTypeId;
    private List<Integer> restourantIdList;
    private boolean recomendation;

    public Food() {
    }

    public Food(int id, String name, String description, double price, List<String> imageUrl, int foodTypeId, List<Integer> restourantIdList, boolean recomendation) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageUrl = imageUrl;
        this.foodTypeId = foodTypeId;
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

    public int getFoodTypeId() {
        return foodTypeId;
    }

    public void setFoodTypeId(int foodTypeId) {
        this.foodTypeId = foodTypeId;
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
