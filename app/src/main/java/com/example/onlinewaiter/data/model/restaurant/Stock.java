package com.example.onlinewaiter.data.model.restaurant;

import java.util.List;

public class Stock {
    private int id;
    private String name;
    private String description;
    private String imageUrl;
    private List<Restaurant> restaurantList;

    public Stock() {
    }

    public Stock(int id, String name, String description, String imageUrl, List<Restaurant> restaurantList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.restaurantList = restaurantList;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
}
