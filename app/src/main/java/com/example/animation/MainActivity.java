package com.example.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int i1=0,i2=0,i3=0;
Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b1.startAnimation(animation);
        i1=1;
    }

    public void start(View view) {if(i1==1){
        Toast.makeText(getApplicationContext(),"Does not work",Toast.LENGTH_SHORT).show();
    }
    else if(i3==1){
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        b3.clearAnimation();
        b1.startAnimation(animation);
        i1=1;
        i3=0;
    }
    else if (i2==1){
        Toast.makeText(getApplicationContext(),"Button 3 will work",Toast.LENGTH_SHORT).show();
    }
    }

    public void start1(View view) {
        if(i1==1)
        {
        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        b1.clearAnimation();
        b2.startAnimation(animation);
        i1=0;
        i2=1;}
        else if(i2==1){
            Toast.makeText(getApplicationContext(),"Does not work",Toast.LENGTH_SHORT).show();
        }
        else if (i3==1){
            Toast.makeText(getApplicationContext(),"we are in the end game",Toast.LENGTH_SHORT).show();
        }
    }

    public void start2(View view) {
        if(i2==1)
        {
            Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
            b2.clearAnimation();
            b3.startAnimation(animation);
            i2=0;
            i3=1;
            Toast.makeText(getApplicationContext(),"END GAME",Toast.LENGTH_SHORT).show();
        }
        else if(i3==1){
            Toast.makeText(getApplicationContext(),"Does not work",Toast.LENGTH_SHORT).show();
        }
        else if (i1==1){
            Toast.makeText(getApplicationContext(),"Button 2 will work",Toast.LENGTH_SHORT).show();
        }
    }

    public void start3(View view) {

        Animation animation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        Animation animation2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce1);
        Animation animation3= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce2);
        b4.startAnimation(animation1);
        if (animation1.getDuration()==5000){
        b4.startAnimation(animation2);}
        if (animation2.hasEnded()){
        b4.startAnimation(animation3);
    }}
}
