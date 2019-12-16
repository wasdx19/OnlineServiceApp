package com.example.onlinewaiter.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.onlinewaiter.R;
import com.example.onlinewaiter.UI.RestaurantsFragment.RestaurantsFragment;
import com.example.onlinewaiter.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        activityMainBinding.bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selected=null;
                switch (menuItem.getItemId()){
                    case R.id.explore:
                        activityMainBinding.tvToolbar.setText("Explore");
                        break;
                    case R.id.orders:
                        activityMainBinding.tvToolbar.setText("My orders");
                        break;
                    case R.id.restaurants:
                        activityMainBinding.tvToolbar.setText("Restaurants");
                        selected=RestaurantsFragment.newInstance();
                        break;
                    case R.id.favs:
                        activityMainBinding.tvToolbar.setText("Favourates");
                        break;
                    case R.id.profile:
                        activityMainBinding.tvToolbar.setText("My profile");
                        break;
                }

                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frame, selected);
                fragmentTransaction.commit();

                return true;
            }
        });

        activityMainBinding.bottomNav.setSelectedItemId(R.id.restaurants);
        activityMainBinding.bottomNav.setItemHorizontalTranslationEnabled(false);
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, RestaurantsFragment.newInstance());
        fragmentTransaction.commit();
    }
}
