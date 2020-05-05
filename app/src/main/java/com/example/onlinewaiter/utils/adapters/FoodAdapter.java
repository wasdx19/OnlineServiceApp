package com.example.onlinewaiter.utils.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinewaiter.R;
import com.example.onlinewaiter.data.model.restaurant.Food;
import com.example.onlinewaiter.databinding.ItemFoodListBinding;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private final List<Food> foods = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFoodListBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_food_list, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        Food food=foods.get(position);
        holder.binding.setFood(food);
    }

    @Override
    public int getItemCount() {
        if (foods != null)
            return foods.size();
        else
            return 0;
    }

    public void addData(List<Food> foods) {
        foods.addAll(foods);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ItemFoodListBinding binding;

        public ViewHolder(@NonNull ItemFoodListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
