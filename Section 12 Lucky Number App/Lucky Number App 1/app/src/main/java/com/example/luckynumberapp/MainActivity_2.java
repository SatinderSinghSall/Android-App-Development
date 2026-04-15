package com.example.luckynumberapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class MainActivity_2 extends AppCompatActivity
{
    TextView textView_OutputNumber;
    TextView textView_UserView;
    Button appButton_ShareLuckyNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        textView_OutputNumber = findViewById(R.id.textView_OutputNumber);
        textView_UserView = findViewById(R.id.textView_UserView);
        appButton_ShareLuckyNumber = findViewById(R.id.appButton_ShareLuckyNumber);

        Intent ObjectOf_Intent = getIntent();
        String UserName = ObjectOf_Intent.getStringExtra("UserName");

        int RandomNumber = GenerateRandomNumbers();
        textView_OutputNumber.setText("" + RandomNumber);

        appButton_ShareLuckyNumber.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ShareMyLuckyNumber(UserName, RandomNumber);
            }
        });
    }

    public int GenerateRandomNumbers()
    {
        Random ObjectOf_Random = new Random();
        int Max_UpperLimit = 1000;
        int RandomNumberGenerated = ObjectOf_Random.nextInt(Max_UpperLimit);
        return RandomNumberGenerated;
    }

    public void ShareMyLuckyNumber(String UserName, int RandomNumber)
    {
        Intent ObjectOf_Intent2 = new Intent(Intent.ACTION_SEND);
        ObjectOf_Intent2.setType("text/plain");

        ObjectOf_Intent2.putExtra(Intent.EXTRA_SUBJECT, UserName + "got lucky today!!");
        ObjectOf_Intent2.putExtra(Intent.EXTRA_SUBJECT, "Their lucky number is :" + RandomNumber);
        startActivity(Intent.createChooser(ObjectOf_Intent2, "Please Choose a platform."));
    }
}
