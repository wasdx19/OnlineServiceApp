package com.example.onlinewaiter.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.onlinewaiter.R;
import com.example.onlinewaiter.UI.ExploreFragment.ExploreFragment;
import com.example.onlinewaiter.UI.FavouratesFragment.FavourateFragment;
import com.example.onlinewaiter.UI.ProfileFragment.ProfileFragment;
import com.example.onlinewaiter.UI.RestaurantsFragment.RestaurantsFragment;
import com.example.onlinewaiter.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        activityMainBinding.bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selected=null;
                switch (menuItem.getItemId()){
                    case R.id.explore:
                        activityMainBinding.tvToolbar.setText("Explore");
                        selected= ExploreFragment.newInstance();
                        break;
//                    case R.id.orders:
//                        activityMainBinding.tvToolbar.setText("My orders");
//                        break;
                    case R.id.restaurants:
                        activityMainBinding.tvToolbar.setText("Restaurants");
                        selected=RestaurantsFragment.newInstance();
                        break;
                    case R.id.favs:
                        activityMainBinding.tvToolbar.setText("Favourates");
                        selected= FavourateFragment.newInstance();
                        break;
                    case R.id.profile:
                        activityMainBinding.tvToolbar.setText("Hello, Azhar");
                        selected= ProfileFragment.newInstance();
                        break;
                }

                replaceFragment(R.id.frame,selected);
                return true;
            }
        });

        activityMainBinding.bottomNav.setSelectedItemId(R.id.restaurants);
        activityMainBinding.bottomNav.setItemHorizontalTranslationEnabled(false);

        replaceFragment(R.id.frame,RestaurantsFragment.newInstance());
    }

    public void replaceFragment(int id,Fragment fragment){
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(id, fragment);
        fragmentTransaction.commit();
    }
}
