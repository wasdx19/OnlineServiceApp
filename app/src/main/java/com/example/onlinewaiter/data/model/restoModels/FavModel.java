package com.example.onlinewaiter.data.model.restoModels;

import java.io.Serializable;

public class FavModel implements Serializable {
    private int id;
    private int user_id;
    private int resto_id;

    public FavModel(int id, int user_id, int resto_id) {
        this.id = id;
        this.user_id = user_id;
        this.resto_id = resto_id;
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
}
