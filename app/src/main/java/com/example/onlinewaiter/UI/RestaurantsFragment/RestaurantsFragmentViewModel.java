package com.example.onlinewaiter.UI.RestaurantsFragment;

import androidx.lifecycle.ViewModel;

import com.example.onlinewaiter.data.model.restaurant.Restaurant;
import com.example.onlinewaiter.data.Repository.RestaurantRepo;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsFragmentViewModel extends ViewModel {

    private RestaurantRepo repo;

    private List<Restaurant> restaurants=new ArrayList<>();

    public RestaurantsFragmentViewModel() {

    }

    public List<Restaurant> getRestaurantList(){
        restaurants.add(new Restaurant(1,"Nedelka","The Best Cafe in Almaty",
                "The best place to spend time with your friends. Inspiration and cool atmosphere",
                "Abay 124","123456","123456","87024840846",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new Restaurant(2,"Starbucks","The Best Coffee ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Saptaeva 34","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new Restaurant(3,"Tomato","The Best place ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Zhandosova 34","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new Restaurant(4,"Сухой закон","The Best Bar ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Saptaeve 123","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        return restaurants;
    }
}
