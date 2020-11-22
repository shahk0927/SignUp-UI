package com.pro.signupui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DoneActivity extends AppCompatActivity {

    ImageView done;

    AnimatedVectorDrawableCompat avd;
    AnimatedVectorDrawable avd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);

        done = findViewById(R.id.imageView);


        supportDone();
    }

    private void supportDone() {

        Drawable drawable = done.getDrawable();
        if(drawable instanceof AnimatedVectorDrawableCompat){

            avd = (AnimatedVectorDrawableCompat) drawable;
            avd.start();
        }
        else if(drawable instanceof AnimatedVectorDrawable){
            avd2 = (AnimatedVectorDrawable) drawable;
            avd2.start();
        }
    }
}