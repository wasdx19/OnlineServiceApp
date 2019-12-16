package com.example.onlinewaiter.data.Network.Api;

import androidx.lifecycle.LiveData;

import com.example.onlinewaiter.data.model.restaurant.Restaurant;
import com.example.onlinewaiter.data.Network.NetworkUtills.ApiResponse;

import retrofit2.http.GET;

public interface TheRestaurantLiveDataApi {

    @GET("restaurants/restaurant")
    LiveData<ApiResponse<Restaurant>> getRestaurant();

    @GET("lists/restaurants")
    LiveData<ApiResponse<Restaurant>> getRestaurantList();

}
