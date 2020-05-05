package com.example.onlinewaiter.UI.FavouratesFragment;

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
import com.example.onlinewaiter.databinding.FragmentFavBinding;
import com.example.onlinewaiter.utils.adapters.FavourateAdapter;

public class FavourateFragment extends Fragment {

    private FragmentFavBinding binding;
    private FavourateFragmnetViewModel viewModel;

    public static FavourateFragment newInstance() {
        return new FavourateFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_fav,container,false);
        viewModel = ViewModelProviders.of(this).get(FavourateFragmnetViewModel.class);

        FavourateAdapter adapter=new FavourateAdapter();
        adapter.addData(viewModel.getRestaurantList());

        binding.recyclerFav.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.recyclerFav.setAdapter(adapter);

        return binding.getRoot();
    }
}
