package com.example.onlinewaiter.data.FakeRepo;

import com.example.onlinewaiter.data.model.restoModels.FoodModel;
import com.example.onlinewaiter.data.model.restoModels.FoodTypeModel;
import com.example.onlinewaiter.data.model.restoModels.UserModel;

import java.util.ArrayList;
import java.util.List;

public class FoodTypeRepo {
    private static FoodTypeRepo instance;
    private static final Object LOCK = new Object();

    private List<FoodTypeModel> foodTypes=new ArrayList<>();

    public FoodTypeRepo(){

    }

    public static FoodTypeRepo getInstance(){
        if(instance==null){
            synchronized (LOCK){
                instance=new FoodTypeRepo();
            }
        }
        return instance;
    }

    public List<FoodTypeModel> getFoodTypes(){
        foodTypes.add(new FoodTypeModel(1,"Salad",1));
        foodTypes.add(new FoodTypeModel(2,"Pasta",1));
        foodTypes.add(new FoodTypeModel(3,"Soup",1));
        foodTypes.add(new FoodTypeModel(4,"Sushi",1));
        foodTypes.add(new FoodTypeModel(5,"Drinks",1));

        foodTypes.add(new FoodTypeModel(1,"Salad",2));
        foodTypes.add(new FoodTypeModel(2,"Pasta",2));
        foodTypes.add(new FoodTypeModel(3,"Soup",2));
        foodTypes.add(new FoodTypeModel(4,"Sushi",2));
        foodTypes.add(new FoodTypeModel(5,"Drinks",2));

        foodTypes.add(new FoodTypeModel(1,"Salad",3));
        foodTypes.add(new FoodTypeModel(2,"Pasta",3));
        foodTypes.add(new FoodTypeModel(3,"Soup",3));
        foodTypes.add(new FoodTypeModel(4,"Sushi",3));
        foodTypes.add(new FoodTypeModel(5,"Drinks",3));

        foodTypes.add(new FoodTypeModel(1,"Salad",3));
        foodTypes.add(new FoodTypeModel(2,"Pasta",3));
        foodTypes.add(new FoodTypeModel(3,"Soup",3));
        foodTypes.add(new FoodTypeModel(4,"Sushi",3));
        foodTypes.add(new FoodTypeModel(5,"Drinks",3));

        return foodTypes;
    }
}
