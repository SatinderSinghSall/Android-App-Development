package com.example.luckynumberapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    EditText editText_UserName;
    Button appButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText_UserName = findViewById(R.id.editText);
        appButton = findViewById(R.id.appButton);
        textView = findViewById(R.id.textView);

        appButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String UserName = editText_UserName.getText().toString();

                Intent ObjectOf_Intent = new Intent(getApplicationContext(), MainActivity_2.class);
                ObjectOf_Intent.putExtra("UserName", UserName);
                startActivity(ObjectOf_Intent);
            }
        });
    }
}
