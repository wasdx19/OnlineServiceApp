package com.example.onlinewaiter.data.FakeRepo;

import com.example.onlinewaiter.data.model.restoModels.FavModel;
import com.example.onlinewaiter.data.model.restoModels.UserModel;

import java.util.ArrayList;
import java.util.List;

public class FavourateRepo {
    private static FavourateRepo instance;
    private static final Object LOCK = new Object();

    private List<FavModel> favs=new ArrayList<>();

    public FavourateRepo(){

    }

    public static FavourateRepo getInstance(){
        if(instance==null){
            synchronized (LOCK){
                instance=new FavourateRepo();
            }
        }
        return instance;
    }
}
