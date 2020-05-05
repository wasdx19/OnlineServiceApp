package com.example.onlinewaiter.UI;

import androidx.lifecycle.ViewModel;

import com.example.onlinewaiter.data.FakeRepo.FoodRepo;
import com.example.onlinewaiter.data.FakeRepo.FoodTypeRepo;
import com.example.onlinewaiter.data.FakeRepo.RestaurantRepo;
import com.example.onlinewaiter.data.model.restaurant.Food;
import com.example.onlinewaiter.data.model.restoModels.FoodTypeModel;
import com.example.onlinewaiter.data.model.restoModels.RestaurantModel;

import java.util.ArrayList;
import java.util.List;

public class RestaurantActivityViewModel extends ViewModel {
    private RestaurantRepo repo;
    private FoodTypeRepo foodTypeRepo;
    private FoodRepo foodRepo;

    private List<RestaurantModel> restaurants=new ArrayList<>();
    private ArrayList<FoodTypeModel> foodTypeList=new ArrayList<>();

    public RestaurantActivityViewModel() {
        this.repo=RestaurantRepo.getInstance();
        this.foodTypeRepo=FoodTypeRepo.getInstance();
        this.foodRepo= FoodRepo.getInstance();
    }

    public List<RestaurantModel> getRestaurantList(){
        return repo.getRestaurantList();
    }

    public List<FoodTypeModel> getFoodTypes(int resto_id){
        ArrayList<FoodTypeModel> foodTypes= (ArrayList<FoodTypeModel>) foodTypeRepo.getFoodTypes();

        for(int i=0; i<foodTypes.size();i++){
            if(resto_id==foodTypes.get(i).getResto_id()){
                foodTypeList.add(foodTypes.get(i));
            }
        }
        return foodTypeList;
    }
}
