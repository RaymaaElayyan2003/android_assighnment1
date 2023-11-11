package com.example.buzzzzzzzzzzzzzzzzzzzzzzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.myapplication.R;
public class MyWelcome extends AppCompatActivity {
    private Button moving;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_welcome);
        moving=(Button)findViewById(R.id.moving);
        moving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyWelcome.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}