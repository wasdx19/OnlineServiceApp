package com.example.onlinewaiter.data.model.restaurant;

import java.util.List;

public class MenuFoodTypes {
    private int id;
    private String name;
    private String description;
    private List<Food> foodList;
    private int menuId;
    private List<Integer> restourantIdList;

    public MenuFoodTypes() {
    }

    public MenuFoodTypes(int id, String name, String description, List<Food> foodList, int menuId, List<Integer> restourantIdList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.foodList = foodList;
        this.menuId = menuId;
        this.restourantIdList = restourantIdList;
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

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public List<Integer> getRestourantIdList() {
        return restourantIdList;
    }

    public void setRestourantIdList(List<Integer> restourantIdList) {
        this.restourantIdList = restourantIdList;
    }
}
