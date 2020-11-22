package com.pro.signupui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView loginTv, signupTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        loginTv = findViewById(R.id.loginTv);
        signupTv = findViewById(R.id.signUptv);

        loginTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,LogInActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.move_in_left,R.anim.move_out_right);


            }
        });

        signupTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,SignUpActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.move_in_right,R.anim.move_out_left);


            }
        });
    }
}