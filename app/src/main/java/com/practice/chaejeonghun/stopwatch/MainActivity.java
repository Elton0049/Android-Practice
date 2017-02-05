package com.practice.chaejeonghun.stopwatch;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Use these variables to make stopWatch work
    private int seconds;
    private boolean running;
    private Thread countTimeThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(...); // Inflate layout file you wrote for this activity
        runTimer();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //When you leave MainActivity,
        //You should stop counting seconds.
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //When the MainActivity get destroyed,
        //countTimeThread must be stopped otherwise it will run forever on your memory
        // Hint : search for interrupt() method in Thread class.
    }

    //This is core logic of stopWatch and called only once.
    //
    private void runTimer() {
        TextView timeView = (TextView) findViewById(R.id.time_represent);
        final Handler handler = new Handler(); // handler for Main Thread (UI Thread) so pass UI code to this.
        countTimeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (running) {
                    // Every second, you should update seconds variable of MainActivity and request UI Thread to update time.
                    // example of using handler:
                    //
                    // handler.post(new Runnable() {
                    //            @Override
                    //            public void run() {
                    //                Do something..
                    //            }
                }
            }
        });
    }

    // seconds -> hh : mm : ss (ex : 4825 -> 01 : 20 : 25 )
    private String timeFormatter(int seconds) {
        //Use this String.format(...) method only thing you have to do is
        //convert seconds to hours, minutes, secs and pass them to the method
        //String.format("%02d:%02d:%02d", hours, minutes, secs) -> formatted String hh:mm:ss

        return ...;
    }
}
