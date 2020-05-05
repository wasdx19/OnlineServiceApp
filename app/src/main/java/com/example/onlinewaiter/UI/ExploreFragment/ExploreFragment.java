package com.example.onlinewaiter.UI.ExploreFragment;

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
import com.example.onlinewaiter.databinding.FragmentExploreBinding;
import com.example.onlinewaiter.utils.adapters.ExploreRestaurantsAdapter;

public class ExploreFragment extends Fragment {

    public static ExploreFragment newInstance() {
        return new ExploreFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentExploreBinding binding= DataBindingUtil.inflate(inflater, R.layout.fragment_explore, container, false);
        ExploreFragmentViewModel viewModel= ViewModelProviders.of(this).get(ExploreFragmentViewModel.class);

        ExploreRestaurantsAdapter adapter=new ExploreRestaurantsAdapter();
        adapter.addData(viewModel.getRestaurantList());

        binding.recyclerNear.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        binding.recyclerNear.setAdapter(adapter);

        binding.recyclerRestos.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        binding.recyclerRestos.setAdapter(adapter);


        return binding.getRoot();
    }
}
