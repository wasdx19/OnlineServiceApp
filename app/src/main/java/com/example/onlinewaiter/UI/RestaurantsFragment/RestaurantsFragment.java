package com.example.onlinewaiter.UI.RestaurantsFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.onlinewaiter.R;
import com.example.onlinewaiter.UI.RestourantActivity;
import com.example.onlinewaiter.data.model.restoModels.RestaurantModel;
import com.example.onlinewaiter.databinding.FragmentRestourantsBinding;
import com.example.onlinewaiter.utils.adapters.RestourantsAdapter;

public class RestaurantsFragment extends Fragment implements RestourantsAdapter.ClickedListener {

    private FragmentRestourantsBinding restourantsBinding;
    private RestaurantsFragmentViewModel restaurantsVM;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        restourantsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_restourants, container, false);
        restaurantsVM = ViewModelProviders.of(this).get(RestaurantsFragmentViewModel.class);

        RestourantsAdapter restourantsAdapter = new RestourantsAdapter(this);
        restourantsBinding.recycler1.setLayoutManager(new LinearLayoutManager(getActivity()));
        restourantsBinding.recycler1.setAdapter(restourantsAdapter);
        restourantsAdapter.addData(restaurantsVM.getRestaurantList());

        return restourantsBinding.getRoot();
    }

    public static RestaurantsFragment newInstance() {
        return new RestaurantsFragment();
    }

    @Override
    public void itemClicked(RestaurantModel restaurantModel) {
        Intent intent = new Intent(getContext(), RestourantActivity.class);
        intent.putExtra("data", restaurantModel);
        startActivity(intent);
    }
}
