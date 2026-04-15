package com.example.unitconverterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    EditText editText_UserInout;
    Button appButton;
    TextView textView_UsersWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        editText_UserInout = findViewById(R.id.editText_UserInout);
        appButton = findViewById(R.id.appButton);
        textView_UsersWeight = findViewById(R.id.textView_UsersWeight);

        appButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String UserInput = editText_UserInout.getText().toString();
                double UserInputKilos = Double.parseDouble(UserInput);
                double UserInputPounds = appConversionCalculation(UserInputKilos);

                textView_UsersWeight.setText("" + UserInputPounds);
            }
        });
    }

    public double appConversionCalculation(double userWeightKilos)
    {
        return userWeightKilos * 2.20462;
    }
}
