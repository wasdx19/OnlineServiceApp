package com.example.onlinewaiter.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinewaiter.R;
import com.example.onlinewaiter.data.model.restoModels.RestaurantModel;
import com.example.onlinewaiter.databinding.ActivityRestaurantBinding;
import com.example.onlinewaiter.utils.adapters.FoodAdapter;
import com.example.onlinewaiter.utils.adapters.FoodTypeAdapter;
import com.example.onlinewaiter.utils.adapters.RestourantsAdapter;
import com.example.onlinewaiter.data.model.restaurant.Restaurant;
import com.google.android.material.appbar.AppBarLayout;


import java.util.ArrayList;
import java.util.List;

public class RestourantActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityRestaurantBinding binding;
    private RestaurantModel resto;
    private RestaurantActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = ViewModelProviders.of(this).get(RestaurantActivityViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_restaurant);

        setSupportActionBar(binding.toolbar);

        Intent intent = getIntent();
        resto = (RestaurantModel) intent.getExtras().getSerializable("data");

        binding.appBar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + i == 0) {
                    isShow = true;
                    showBackButton();

                } else if (isShow) {
                    isShow = false;
                    //hideOption(R.id.action_info);
                    hideBackButton();
                }
            }
        });

        setView();

        binding.cardBack.setOnClickListener(this);
    }

    public void setView(){
        binding.setRestData(resto);

        FoodAdapter foodAdapter=new FoodAdapter();
        FoodTypeAdapter typeAdapter=new FoodTypeAdapter();

        binding.recyclerType.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        binding.recyclerType.setAdapter(typeAdapter);
        typeAdapter.addData(viewModel.getFoodTypes(resto.getId()));


    }

    public void showBackButton() {
        binding.tvTitle.setVisibility(View.VISIBLE);
    }

    public void hideBackButton() {
        binding.tvTitle.setVisibility(View.GONE);
    }

    public void back(){
        resto=null;
        onBackPressed();
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id) {
            case R.id.card_back:
                back();
                break;
        }
    }
}
