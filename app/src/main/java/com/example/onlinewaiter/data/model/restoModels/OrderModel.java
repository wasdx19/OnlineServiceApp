package com.example.onlinewaiter.data.model.restoModels;

import java.io.Serializable;
import java.util.List;

public class OrderModel implements Serializable {
    private int id;
    private int user_id;
    private int resto_id;
    private double total_price;
    private double service_price;
    private List<OrderFoodModel> food;

    public OrderModel(int id, int user_id, int resto_id, double total_price, double service_price, List<OrderFoodModel> food) {
        this.id = id;
        this.user_id = user_id;
        this.resto_id = resto_id;
        this.total_price = total_price;
        this.service_price = service_price;
        this.food = food;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getResto_id() {
        return resto_id;
    }

    public void setResto_id(int resto_id) {
        this.resto_id = resto_id;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public double getService_price() {
        return service_price;
    }

    public void setService_price(double service_price) {
        this.service_price = service_price;
    }

    public List<OrderFoodModel> getFood() {
        return food;
    }

    public void setFood(List<OrderFoodModel> food) {
        this.food = food;
    }
}
