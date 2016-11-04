package com.example.pranay.bottomnavigationview;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvTabText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvTabText=(TextView)findViewById(R.id.tvTabText);
        initNavigationMenu();
    }

    private void initNavigationMenu() {
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.menu_github:
                                tvTabText.setText(getString(R.string.str_github));
                                break;
                            case R.id.menu_stackoverflow:
                                tvTabText.setText(getString(R.string.str_stackoverflow));
                                break;
                            case R.id.menu_facebook:
                                tvTabText.setText(getString(R.string.str_facebook));
                                break;
                            case R.id.menu_twitter:
                                tvTabText.setText(getString(R.string.str_twitter));
                                break;
                            case R.id.menu_instagram:
                                tvTabText.setText(getString(R.string.str_instagram));
                                break;
                        }
                        return false;
                    }
                });
    }
}
