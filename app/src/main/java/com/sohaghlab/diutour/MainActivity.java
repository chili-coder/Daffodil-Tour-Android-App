package com.sohaghlab.diutour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {

    ///initialize variable
    MeowBottomNavigation meowBottomNavigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //assign variable
        meowBottomNavigation = findViewById(R.id.bottom_navigation);

        //add buttom manu item
        meowBottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_home));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_deshboard));
        meowBottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_person));

        meowBottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {

                ///initialize fragment
                Fragment fragment = null;

                ///condition
                switch (item.getId()){
                    case 1:
                        fragment = new HomeFragment();
                        break;
                    case 2:
                        fragment = new  DeshboardFragment();
                        break;
                    case 3:
                        fragment = new ProfileFragment();
                        break;
                }
                    ///loadfragment
                 loadFrigment(fragment);
            }
        });

        //select fragment
        meowBottomNavigation.show(1,true);
        /// item click
        meowBottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {


             // Toast.makeText(getApplicationContext(), "Clicked"+ item.getId(), Toast.LENGTH_SHORT).show();
            }
        });

        meowBottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
               /// Toast.makeText(getApplicationContext(), "Reselected"+ item.getId(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void loadFrigment(Object fragment) {

       // replecefragment

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, (androidx.fragment.app.Fragment) fragment)
                .commit();
    }
}