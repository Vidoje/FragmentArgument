package com.taurunium.fragmentargument;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button bt_plus, bt_minus, bt_reset;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_plus = (Button)findViewById(R.id.bt_plus);
        bt_minus = (Button)findViewById(R.id.bt_minus);
        bt_reset = (Button)findViewById(R.id.bt_reset);

        //open fragment
        openFragment();

        bt_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                openFragment();
            }
        });

        bt_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                openFragment();
            }
        });

        bt_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                openFragment();
            }
        });
    }

    private void openFragment(){
        //initialize bundle
        Bundle bundle = new Bundle();
        bundle.putString("count",String.valueOf(count));

        Fragment fragment = new MainFragment();
        fragment.setArguments(bundle);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit();
    }
}