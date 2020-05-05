package com.example.onlinewaiter.data.FakeRepo;

import com.example.onlinewaiter.UI.OrderTypeSheetFragment;
import com.example.onlinewaiter.data.model.restoModels.OrderModel;
import com.example.onlinewaiter.data.model.restoModels.UserModel;

import java.util.ArrayList;
import java.util.List;

public class OrderRepo {
    private static OrderRepo instance;
    private static final Object LOCK = new Object();

    private List<OrderModel> orders=new ArrayList<>();

    public OrderRepo(){

    }

    public static OrderRepo getInstance(){
        if(instance==null){
            synchronized (LOCK){
                instance=new OrderRepo();
            }
        }
        return instance;
    }
}
