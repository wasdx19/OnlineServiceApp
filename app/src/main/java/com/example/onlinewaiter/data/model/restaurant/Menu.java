package com.example.onlinewaiter.data.model.restaurant;

import java.util.List;

public class Menu {
    private int id;
    private List<MenuFoodTypes> menuFoodTypesList;
    private List<MenuDrinkTypes> menuDrinkTypesList;
    private List<Integer> restourantIdList;

    public Menu() {
    }

    public Menu(int id, List<MenuFoodTypes> menuFoodTypesList, List<MenuDrinkTypes> menuDrinkTypesList, List<Integer> restourantIdList) {
        this.id = id;
        this.menuFoodTypesList = menuFoodTypesList;
        this.menuDrinkTypesList = menuDrinkTypesList;
        this.restourantIdList = restourantIdList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<MenuFoodTypes> getMenuFoodTypesList() {
        return menuFoodTypesList;
    }

    public void setMenuFoodTypesList(List<MenuFoodTypes> menuFoodTypesList) {
        this.menuFoodTypesList = menuFoodTypesList;
    }

    public List<MenuDrinkTypes> getMenuDrinkTypesList() {
        return menuDrinkTypesList;
    }

    public void setMenuDrinkTypesList(List<MenuDrinkTypes> menuDrinkTypesList) {
        this.menuDrinkTypesList = menuDrinkTypesList;
    }

    public List<Integer> getRestourantIdList() {
        return restourantIdList;
    }

    public void setRestourantIdList(List<Integer> restourantIdList) {
        this.restourantIdList = restourantIdList;
    }
}
