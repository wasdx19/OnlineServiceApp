package com.example.onlinewaiter.utils.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.onlinewaiter.R;
import com.example.onlinewaiter.data.model.restaurant.MenuFoodTypes;
import com.example.onlinewaiter.data.model.restoModels.FoodTypeModel;
import com.example.onlinewaiter.databinding.ItemFoodTypeBinding;

import java.util.ArrayList;
import java.util.List;

public class FoodTypeAdapter extends RecyclerView.Adapter<FoodTypeAdapter.ViewHolder> {

    private final List<FoodTypeModel> foodTypes = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemFoodTypeBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.item_food_type, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodTypeAdapter.ViewHolder holder, int position) {
        FoodTypeModel type=foodTypes.get(position);
        holder.binding.setType(type);
    }

    @Override
    public int getItemCount() {
        if (foodTypes != null)
            return foodTypes.size();
        else
            return 0;
    }

    public void addData(List<FoodTypeModel> types) {
        foodTypes.addAll(types);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ItemFoodTypeBinding binding;

        public ViewHolder(@NonNull ItemFoodTypeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
