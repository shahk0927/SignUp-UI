package com.pro.signupui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    TextView signup,tvNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        signup = findViewById(R.id.tvCreateAccount);
        tvNext = findViewById(R.id.tvNext);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this,SignUpActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.move_in_right,R.anim.move_out_left);

                finish();

            }
        });

        tvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this,DoneActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.move_in_left,R.anim.move_out_right);
                finish();

            }
        });
    }
}