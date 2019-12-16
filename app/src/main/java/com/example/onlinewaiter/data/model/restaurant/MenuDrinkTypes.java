package com.example.onlinewaiter.data.model.restaurant;

import java.util.List;

public class MenuDrinkTypes {
    private int id;
    private String name;
    private List<Drink> drinks;
    private int menuId;
    private List<Integer> restourantIdList;

    public MenuDrinkTypes() {
    }

    public MenuDrinkTypes(int id, String name, List<Drink> drinks, int menuId, List<Integer> restourantIdList) {
        this.id = id;
        this.name = name;
        this.drinks = drinks;
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

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
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
