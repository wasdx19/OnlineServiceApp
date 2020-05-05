package com.example.onlinewaiter.data.FakeRepo;

import com.example.onlinewaiter.data.model.restoModels.RestaurantModel;
import com.example.onlinewaiter.data.model.restoModels.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private static UserRepo instance;
    private static final Object LOCK = new Object();

    private List<UserModel> users=new ArrayList<>();

    public UserRepo(){

    }

    public static UserRepo getInstance(){
        if(instance==null){
            synchronized (LOCK){
                instance=new UserRepo();
            }
        }
        return instance;
    }

    public List<UserModel> getAllUsers(){
        users.add(new UserModel(1,"vangog@gmail.com","qwerty123","Ansar","Azatkhanov"));
        users.add(new UserModel(2,"lolita@gmail.com","qwerty123","Lolita","Ablina"));
        users.add(new UserModel(3,"niyet@gmail.com","qwerty123","Niyet","Kabyshev"));
        users.add(new UserModel(4,"azhar@gmail.com","qwerty123","Azhar","Bokes"));

        return users;
    }
}
