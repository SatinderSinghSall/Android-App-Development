package com.example.viewsandwidgets;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView developerName = findViewById(R.id.developerName);
        EditText editText_Name = findViewById(R.id.editText_Name);
        EditText editText_Message = findViewById(R.id.editText_Message);
        Button submitButton = findViewById(R.id.submitButton);
        ImageView backgroundImage = findViewById(R.id.backgroundImage);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputName = editText_Name.getText().toString().trim();
                String inputMessage = editText_Message.getText().toString().trim();

                if(TextUtils.isEmpty(inputName)) {
                    editText_Name.setError("Please enter your name!");
                    return;
                }

                if(TextUtils.isEmpty(inputMessage)) {
                    editText_Message.setError("Please enter your message!");
                    return;
                }

                if(inputMessage.length() < 5) {
                    editText_Message.setError("Message should be at least 5 characters long");
                    return;
                }

                Toast.makeText(MainActivity.this, "Thank you, " + inputName + " will reach out to you soon.", Toast.LENGTH_SHORT).show();
            }
        });

        developerName.setText("Hi, I am developer Satinder!");
        backgroundImage.setImageResource(R.drawable.app_background);
    }
}
