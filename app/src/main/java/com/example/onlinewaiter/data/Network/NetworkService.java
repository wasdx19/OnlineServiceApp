package com.example.onlinewaiter.data.Network;

import com.example.onlinewaiter.Common.AppConstants;
import com.example.onlinewaiter.data.Network.Api.TheRestaurantLiveDataApi;
import com.example.onlinewaiter.utils.adapters.LiveDataCallAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetworkService {
    private static NetworkService networkServiceInstance;
    private Retrofit retrofit;

    private NetworkService(){
        HttpLoggingInterceptor interceptor=new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder client=new OkHttpClient.Builder().addInterceptor(interceptor);

        Gson gson=new GsonBuilder()
                .setLenient()
                .create();

        retrofit=new Retrofit.Builder()
                .addCallAdapterFactory(new LiveDataCallAdapterFactory())
                .baseUrl(AppConstants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client.build())
                .build();
    }

    public static NetworkService getInstance(){
        if(networkServiceInstance==null){
            networkServiceInstance=new NetworkService();
        }
        return networkServiceInstance;
    }

    public TheRestaurantLiveDataApi getRestaurantLiveDataApi(){
        return retrofit.create(TheRestaurantLiveDataApi.class);
    }

}
