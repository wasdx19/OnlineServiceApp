package com.example.onlinewaiter.UI;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.onlinewaiter.R;

public class LoginActivity extends AppCompatActivity {
    Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signin=findViewById(R.id.btn_signin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
