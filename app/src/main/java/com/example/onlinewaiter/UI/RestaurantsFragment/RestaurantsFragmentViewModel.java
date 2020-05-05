package com.example.onlinewaiter.UI.RestaurantsFragment;

import androidx.lifecycle.ViewModel;

import com.example.onlinewaiter.data.FakeRepo.RestaurantRepo;
import com.example.onlinewaiter.data.model.restoModels.RestaurantModel;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsFragmentViewModel extends ViewModel {

    private RestaurantRepo repo;

    private List<RestaurantModel> restaurants=new ArrayList<>();

    public RestaurantsFragmentViewModel(){
        this.repo=RestaurantRepo.getInstance();
    }

    public List<RestaurantModel> getRestaurantList(){
        restaurants=repo.getRestaurantList();
        return restaurants;
    }
}
