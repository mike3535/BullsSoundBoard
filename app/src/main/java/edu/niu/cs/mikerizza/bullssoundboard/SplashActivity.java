package edu.niu.cs.mikerizza.bullssoundboard;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //set timerTask
        TimerTask task = new TimerTask() {
            @Override
            public void run()
            {
                finish();//finish running splash activity
                startActivity(new Intent( SplashActivity.this,MainActivity.class)); // start splash activity

            }//end of run
        };//end of TimerTask

        Timer timer = new Timer();  //new timer
        timer.schedule(task, 5000);  //set length of timer to five seconds
    }
}
