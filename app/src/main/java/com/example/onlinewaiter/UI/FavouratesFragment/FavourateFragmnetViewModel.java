package com.example.onlinewaiter.UI.FavouratesFragment;

import androidx.lifecycle.ViewModel;

import com.example.onlinewaiter.data.FakeRepo.RestaurantRepo;
import com.example.onlinewaiter.data.model.restoModels.RestaurantModel;

import java.util.ArrayList;
import java.util.List;

public class FavourateFragmnetViewModel extends ViewModel {
    private RestaurantRepo repo;
    private List<RestaurantModel> restaurants=new ArrayList<>();

    public FavourateFragmnetViewModel() {
        this.repo=RestaurantRepo.getInstance();
    }

    public List<RestaurantModel> getRestaurantList(){
        return repo.getRestaurantList();
    }
}
