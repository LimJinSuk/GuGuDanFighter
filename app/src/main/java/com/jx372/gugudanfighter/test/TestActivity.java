package com.jx372.gugudanfighter.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import com.jx372.gugudanfighter.R;

public class TestActivity extends AppCompatActivity {
    private Timer timer = new Timer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        timer.schedule(new PlayCameTimerTask(),1000,1000);
    }

    private class PlayCameTimerTask extends TimerTask {
        private int seconds;

        @Override
        public void run() {
            ++seconds;
            if (seconds >= 5){
                timer.cancel();
                return;
            }

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    ((TextView)findViewById(R.id.textView)).setText((30-seconds)+"초");
                }
            });
            //System.out.println(seconds);

        }
    }
}
