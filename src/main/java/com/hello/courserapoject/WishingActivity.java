package com.hello.courserapoject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Calendar;

import java.util.TimeZone;

public class WishingActivity extends AppCompatActivity {
    TextView message_textView,name_textView;
    RelativeLayout rl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishing);


        rl= findViewById(R.id.rl);
        message_textView=findViewById(R.id.message_textView);
        name_textView=findViewById(R.id.name_textView);



        Calendar cal = Calendar.getInstance();
        cal.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        int currentHour = cal.get(Calendar.HOUR_OF_DAY);


        Bundle bundle = getIntent().getExtras();
        String name_user = bundle.getString("message");


         if(currentHour<12){
             message_textView.setText("Good Morning");
             rl.setBackgroundResource(R.drawable.morning);
             Intent intent = getIntent();
             String str = intent.getStringExtra("message");
             name_textView.setText(str);
         }
         else if(currentHour==12){
             message_textView.setText("Good Afternoon");
             rl.setBackgroundResource(R.drawable.afternoon);
             Intent intent = getIntent();
             String str = intent.getStringExtra("message");
             name_textView.setText(str);
         }

         else if(currentHour>12 && currentHour<=7){

             message_textView.setText("Good Evening");
             rl.setBackgroundResource(R.drawable.evening);
             Intent intent = getIntent();
             String str = intent.getStringExtra("message");
             name_textView.setText(str);
         }
         else if(currentHour>=8 && currentHour<=24){

             message_textView.setText("Good Night");
             rl.setBackgroundResource(R.drawable.night);
             Intent intent = getIntent();
             String str = intent.getStringExtra("message");
             name_textView.setText(str);
         }
    }
}
