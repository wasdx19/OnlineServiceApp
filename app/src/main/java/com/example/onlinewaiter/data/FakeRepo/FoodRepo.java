package com.example.onlinewaiter.data.FakeRepo;

import com.example.onlinewaiter.data.model.restoModels.FoodModel;
import com.example.onlinewaiter.data.model.restoModels.UserModel;

import java.util.ArrayList;
import java.util.List;

public class FoodRepo {
    private static FoodRepo instance;
    private static final Object LOCK = new Object();

    private List<FoodModel> foods=new ArrayList<>();

    public FoodRepo(){

    }

    public static FoodRepo getInstance(){
        if(instance==null){
            synchronized (LOCK){
                instance=new FoodRepo();
            }
        }
        return instance;
    }

//    private int id;
//    private String name;
//    private String description;
//    private double price;
//    private double volume;
//    private int foodTypeId;
//    private int resto_id;

    public List<FoodModel> getFoods(){
        foods.add(new FoodModel(1,"Cesar","The best Salad Ever",1200,300,1,1));
        foods.add(new FoodModel(2,"Osenii","The best osenii Salad Ever",1150,300,1,1));
        foods.add(new FoodModel(3,"Cesar 1","The best Salad Ever",1300,300,1,1));
        foods.add(new FoodModel(4,"Cesar 2","The best Salad Ever",1800,300,1,1));

        foods.add(new FoodModel(1,"Cesar","The best Salad Ever",1200,300,2,1));
        foods.add(new FoodModel(2,"Osenii","The best osenii Salad Ever",1150,300,2,1));
        foods.add(new FoodModel(3,"Cesar 1","The best Salad Ever",1300,300,2,1));
        foods.add(new FoodModel(4,"Cesar 2","The best Salad Ever",1800,300,2,1));

        foods.add(new FoodModel(1,"Cesar","The best Salad Ever",1200,300,3,1));
        foods.add(new FoodModel(2,"Osenii","The best osenii Salad Ever",1150,300,3,1));
        foods.add(new FoodModel(3,"Cesar 1","The best Salad Ever",1300,300,3,1));
        foods.add(new FoodModel(4,"Cesar 2","The best Salad Ever",1800,300,3,1));

        foods.add(new FoodModel(1,"Cesar","The best Salad Ever",1200,300,3,1));
        foods.add(new FoodModel(2,"Osenii","The best osenii Salad Ever",1150,300,3,1));
        foods.add(new FoodModel(3,"Cesar 1","The best Salad Ever",1300,300,3,1));
        foods.add(new FoodModel(4,"Cesar 2","The best Salad Ever",1800,300,3,1));

        foods.add(new FoodModel(1,"Cesar","The best Salad Ever",1200,300,3,1));
        foods.add(new FoodModel(2,"Osenii","The best osenii Salad Ever",1150,300,2,1));
        foods.add(new FoodModel(3,"Cesar 1","The best Salad Ever",1300,300,3,1));
        foods.add(new FoodModel(4,"Cesar 2","The best Salad Ever",1800,300,3,1));

        return foods;
    }
}
