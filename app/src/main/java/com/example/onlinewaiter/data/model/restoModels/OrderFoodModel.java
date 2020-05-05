package com.example.onlinewaiter.data.model.restoModels;

import java.io.Serializable;

public class OrderFoodModel  implements Serializable {
    private int id;
    private int food_id;
    private int count;

    public OrderFoodModel(int id, int food_id, int count) {
        this.id = id;
        this.food_id = food_id;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFood_id() {
        return food_id;
    }

    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
