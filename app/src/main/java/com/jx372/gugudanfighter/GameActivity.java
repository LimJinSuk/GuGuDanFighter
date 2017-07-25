package com.jx372.gugudanfighter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity {

    final int[] BUTTON_IDS={
            R.id.button_0_0, R.id.button_0_1, R.id.button_0_2,
            R.id.button_1_0, R.id.button_1_1, R.id.button_1_2,
            R.id.button_2_0, R.id.button_2_1, R.id.button_2_2
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }
}
