package com.example.lithoapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.app.LauncherActivity;
import android.os.Bundle;

import com.facebook.litho.Component;
import com.facebook.litho.ComponentContext;
import com.facebook.litho.LithoView;
import com.facebook.litho.widget.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ComponentContext c = new ComponentContext(this);

        final Component component = TrafficController.create(c).build();


        setContentView(LithoView.create(this, component));
    }
}
