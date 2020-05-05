package com.example.onlinewaiter.data.model.restoModels;

import java.io.Serializable;

public class FoodTypeModel implements Serializable {
    private int id;
    private String name;
    private int resto_id;

    public FoodTypeModel(int id, String name, int resto_id) {
        this.id = id;
        this.name = name;
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

    public int getResto_id() {
        return resto_id;
    }

    public void setResto_id(int resto_id) {
        this.resto_id = resto_id;
    }
}
