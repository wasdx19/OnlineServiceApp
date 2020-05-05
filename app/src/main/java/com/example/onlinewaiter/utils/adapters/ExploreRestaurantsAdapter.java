package com.example.onlinewaiter.utils.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinewaiter.R;
import com.example.onlinewaiter.UI.RestourantActivity;
import com.example.onlinewaiter.data.model.restoModels.RestaurantModel;
import com.example.onlinewaiter.databinding.ItemExploreListBinding;

import java.util.ArrayList;
import java.util.List;

public class ExploreRestaurantsAdapter extends RecyclerView.Adapter<ExploreRestaurantsAdapter.RestHolder> {

    private final List<RestaurantModel> restList = new ArrayList<>();
    private CardView card;
    private RestaurantModel restaurant;

    @NonNull
    @Override
    public RestHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemExploreListBinding binding=DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()),
                R.layout.item_explore_list, viewGroup, false);

        return new RestHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RestHolder holder, final int position) {
        restaurant = restList.get(position);
        holder.binding.setRest(restaurant);

        holder.binding.cardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RestourantActivity.class);
                intent.putExtra("data", restList.get(position));
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

    public View getClickView(){
        return card;
    }

    public class RestHolder extends RecyclerView.ViewHolder {

        private ItemExploreListBinding binding;

        public RestHolder(@NonNull ItemExploreListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
