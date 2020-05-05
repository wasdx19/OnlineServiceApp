package com.example.onlinewaiter.RoomDB;

import android.database.Cursor;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.onlinewaiter.data.model.restaurant.Restaurant;
import com.example.onlinewaiter.data.model.restoModels.FoodModel;
import com.example.onlinewaiter.data.model.restoModels.FoodTypeModel;
import com.example.onlinewaiter.data.model.restoModels.OrderModel;

import java.util.List;

public interface ProjectDao {

//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void insertResto(List<Restaurant> restos);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void insertOrder(List<OrderModel> orderModels);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void setFoodModels(List<FoodModel> foodModels);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void setFoodTypeModels(List<FoodTypeModel> foodTypeModels);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void setRestos(List<Restaurant> restos);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void setOrders(List<OrderModel> orders);
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    void setFoods(List<FoodModel> foods);
}
