package com.pro.signupui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    TextView login,tvNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        login = findViewById(R.id.loginTitleS);

        tvNext = findViewById(R.id.tvNext);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this,LogInActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.move_in_left,R.anim.move_out_right);

                finish();

            }
        });

        tvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this,DoneActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.move_in_left,R.anim.move_out_right);
                finish();

            }
        });
    }
}