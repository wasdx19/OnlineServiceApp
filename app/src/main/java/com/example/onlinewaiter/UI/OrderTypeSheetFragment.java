package com.example.onlinewaiter.UI;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.onlinewaiter.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class OrderTypeSheetFragment extends BottomSheetDialogFragment {

    public final String TAG=OrderTypeSheetFragment.class.getSimpleName();

    public OrderTypeSheetFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_bottom_sheet,container,false);
    }
}
