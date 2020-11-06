package com.hello.courserapoject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            this.getSupportActionBar().hide();
        }catch(NullPointerException e){

        }
        go =findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondActivity= new Intent(MainActivity.this, SecondActivity.class);
                startActivity(secondActivity);
                Toast.makeText(getApplicationContext(),"now, we are on second activity!!",Toast.LENGTH_SHORT).show();

            }
        });


    }
}
