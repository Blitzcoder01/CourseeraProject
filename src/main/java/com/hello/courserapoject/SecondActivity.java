package com.hello.courserapoject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText username;
    ImageView next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        try{
            this.getSupportActionBar().hide();
        }catch(NullPointerException e){

        }
        username=findViewById(R.id.name_editText);
        next=findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname=username.getText().toString();
                Intent wish= new Intent(getApplicationContext(),WishingActivity.class);
                wish.putExtra("message", fullname);
                startActivity(wish);
                Toast.makeText(getApplicationContext(),"welcome",Toast.LENGTH_LONG).show();



            }
        });

    }
}
