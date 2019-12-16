package com.example.onlinewaiter.data.Repository;


import androidx.lifecycle.LiveData;

import com.example.onlinewaiter.data.model.restaurant.Restaurant;
import com.example.onlinewaiter.data.Network.NetworkService;
import com.example.onlinewaiter.data.Network.NetworkUtills.ApiResponse;
import com.example.onlinewaiter.data.Network.NetworkUtills.NetworkOnlyRepository;
import com.example.onlinewaiter.data.Network.NetworkUtills.ResourceKt;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RestaurantRepo {

    NetworkService networkService;


    public RestaurantRepo() {
        networkService=NetworkService.getInstance();
    }

    public LiveData<ResourceKt<List<Restaurant>>> getRestaurantList(){
        return new NetworkOnlyRepository<List<Restaurant>, List<Restaurant>>(){

            @Nullable
            @Override
            protected LiveData<ApiResponse<Restaurant>> saveLoadedData(List<Restaurant> item) {
                return networkService.getRestaurantLiveDataApi().getRestaurantList();
            }

            @Override
            protected void onFetchFailed(@Nullable Throwable error) {

            }

            @NotNull
            @Override
            protected LiveData<ApiResponse<List<Restaurant>>> fetchService() {
                return null;
            }
        }.asLiveData();
    }

    public LiveData<ResourceKt<Restaurant>> getRestaurant(){
        return new NetworkOnlyRepository<Restaurant,Restaurant>(){

            @Override
            protected void onFetchFailed(@Nullable Throwable error) {

            }

            @NotNull
            @Override
            protected LiveData<ApiResponse<Restaurant>> fetchService() {
                return null;
            }

            @Nullable
            @Override
            protected LiveData<ApiResponse<Restaurant>> saveLoadedData(Restaurant item) {
                return networkService.getRestaurantLiveDataApi().getRestaurant();
            }
        }.asLiveData();
    }
}
