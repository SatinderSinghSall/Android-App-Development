package com.example.satindercounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView result = findViewById(R.id.result);
        Button incrementNumber = findViewById(R.id.incrementNumber);
        Button decrementNumber = findViewById(R.id.decrementNumber);

        result.setText(String.valueOf(counter));

        incrementNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.valueOf(incrementOperator()));
            }
        });

        decrementNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.valueOf(decrementOperator()));
            }
        });
    }

    public int incrementOperator() {
        counter = counter + 1;
        return counter;
    }

    public int decrementOperator() {
        counter = counter - 1;
        return counter;
    }
}
