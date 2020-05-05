package com.example.onlinewaiter.utils.adapters;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.onlinewaiter.data.model.restoModels.RestaurantModel;
import com.example.onlinewaiter.R;
import com.example.onlinewaiter.databinding.ListItemRecyclerBinding;

import java.util.ArrayList;
import java.util.List;

public class RestourantsAdapter extends RecyclerView.Adapter<RestourantsAdapter.RestHolder> {

    private final List<RestaurantModel> restList = new ArrayList<>();
    private RestaurantModel restaurant;
    private ClickedListener clickedListener;

    public RestourantsAdapter(ClickedListener clickedListener) {
        this.clickedListener = clickedListener;
    }

    @NonNull
    @Override
    public RestHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ListItemRecyclerBinding binding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                R.layout.list_item_recycler, viewGroup, false);

        return new RestHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RestHolder restHolder, int i) {
        restaurant = restList.get(i);
        restHolder.binding.setRests(restaurant);

        restHolder.binding.cvRestCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickedListener.itemClicked(restaurant);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (restList != null)
            return restList.size();
        else
            return 0;
    }

    public void addData(List<RestaurantModel> rests) {
        restList.addAll(rests);
        notifyDataSetChanged();
    }

    public class RestHolder extends RecyclerView.ViewHolder {

        private ListItemRecyclerBinding binding;

        public RestHolder(@NonNull ListItemRecyclerBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

    public  interface ClickedListener{
        public void itemClicked(RestaurantModel restaurantModel);
    }
}
