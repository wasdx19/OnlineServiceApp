package com.example.onlinewaiter.UI;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinewaiter.R;
import com.example.onlinewaiter.utils.adapters.RestourantsAdapter;
import com.example.onlinewaiter.data.model.restaurant.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestourantActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RestourantsAdapter restourantsAdapter=new RestourantsAdapter();
    List<Restaurant> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_restourants);



        recyclerView=findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(restourantsAdapter);
        restourantsAdapter.addData(list);
        //restourantsAdapter.setListener(onItemClickListener);
    }
}
