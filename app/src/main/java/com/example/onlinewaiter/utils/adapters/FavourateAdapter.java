package com.example.onlinewaiter.utils.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinewaiter.R;
import com.example.onlinewaiter.UI.RestourantActivity;
import com.example.onlinewaiter.data.model.restoModels.RestaurantModel;
import com.example.onlinewaiter.databinding.ItemFavBinding;

import java.util.ArrayList;
import java.util.List;

public class FavourateAdapter extends RecyclerView.Adapter<FavourateAdapter.ViewHolder> {

    private final List<RestaurantModel> restList = new ArrayList<>();
    private RestaurantModel restaurant;

    @NonNull
    @Override
    public  ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemFavBinding binding=DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),R.layout.item_fav,viewGroup,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        restaurant = restList.get(position);
        holder.binding.setRest(restaurant);

        holder.binding.cvRestCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RestourantActivity.class);
                intent.putExtra("data", restaurant);
                v.getContext().startActivity(intent);
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

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ItemFavBinding binding;

        public ViewHolder(@NonNull ItemFavBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
