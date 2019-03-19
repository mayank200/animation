package com.example.animation;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Main2Activity extends AppCompatActivity {
Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onResume() {
        super.onResume();
/*handler=new Handler();
handler.postDelayed(new Runnable() {
    @Override
    public void run() {

        startActivity(new Intent(Main2Activity.this,MainActivity.class));


    }
},2000);*/

        final int[] count = {10}; //Declare as inatance variable

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        final Toast toast = Toast.makeText(
                                getApplicationContext(), --count[0] + "",
                                Toast.LENGTH_SHORT);
                        toast.show();
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable() {

                            @Override
                            public void run() {
                                toast.cancel();
                                if (count[0]==0){
                                    timer.cancel();
                                }
                            }
                        }, 1000);

                    }
                });
            }
        }, 0, 1000);
    }
}
