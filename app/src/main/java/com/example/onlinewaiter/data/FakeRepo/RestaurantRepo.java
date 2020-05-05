package com.example.onlinewaiter.data.FakeRepo;

import com.example.onlinewaiter.data.model.restaurant.Restaurant;
import com.example.onlinewaiter.data.model.restoModels.RestaurantModel;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepo {
    private static RestaurantRepo instance;
    private static final Object LOCK = new Object();

    private List<RestaurantModel> restaurants=new ArrayList<>();

    public RestaurantRepo(){

    }

    public static RestaurantRepo getInstance(){
        if(instance==null){
                instance=new RestaurantRepo();
        }
        return instance;
    }

    public List<RestaurantModel> getRestaurantList(){
        restaurants.add(new RestaurantModel(0,"Nedelka","The Best Cafe in Almaty",
                "The best place to spend time with your friends. Inspiration and cool atmosphere",
                "Abay 124","123456","123456","87024840846",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new RestaurantModel(1,"Starbucks","The Best Coffee ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Saptaeva 34","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new RestaurantModel(2,"Tomato","The Best place ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Zhandosova 34","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new RestaurantModel(3,"Сухой закон","The Best Bar ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Saptaeve 123","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new RestaurantModel(4,"Elephant","The Best Bar ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Saptaeve 12","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new RestaurantModel(5,"Come In","The Best Bar ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Pravda 123","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new RestaurantModel(6,"Black hole bar","The Best Bar ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Gogolya 87","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new RestaurantModel(7,"Travellers","The Best Bar ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Abaya 15","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new RestaurantModel(8,"Bahandi Burger","The Best Bar ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Auezova 34","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        restaurants.add(new RestaurantModel(9,"Urbo Coffee","The Best Bar ever",
                "Coffee time, helps to be more productive. Best place ever, everywhere",
                "Bayzakova 45","123456","123456","87024840845",
                "Monday-Thursday","08:00","22:00",
                "Friday-Sunday","08:00","00:00"));

        return restaurants;
    }


}
