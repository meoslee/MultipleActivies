package com.batuhan.multipleactivies;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2 = findViewById(R.id.textView2);

        Intent intent = getIntent();
        String UserName = intent.getStringExtra("UserInput");
        textView2.setText(UserName);


        
    }


    public void changeScreen(View view){


        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);







    }

}