package com.example.frenchteacherapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button BlackButton;
    Button GreenButton;
    Button PurpleButton;
    Button RedButton;
    Button YellowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        BlackButton = findViewById(R.id.BlackButton);
        GreenButton = findViewById(R.id.GreenButton);
        PurpleButton = findViewById(R.id.PurpleButton);
        RedButton = findViewById(R.id.RedButton);
        YellowButton = findViewById(R.id.YellowButton);

        BlackButton.setOnClickListener(this);
        GreenButton.setOnClickListener(this);
        PurpleButton.setOnClickListener(this);
        RedButton.setOnClickListener(this);
        YellowButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        int ClickedButtonId = v.getId();

        if (ClickedButtonId == R.id.BlackButton)
        {
            PlaySounds(R.raw.black_color_sound);
        }

        else if (ClickedButtonId == R.id.GreenButton)
        {
            PlaySounds(R.raw.green_color_sound);
        }

        else if (ClickedButtonId == R.id.PurpleButton)
        {
            PlaySounds(R.raw.purple_color_sound);
        }

        else if (ClickedButtonId == R.id.RedButton)
        {
            PlaySounds(R.raw.red_color_sound);
        }

        else
        {
            PlaySounds(R.raw.yellow_color_sound);
        }
    }

    public void PlaySounds(int Id)
    {
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                Id
        );
        mediaPlayer.start();
    }
}
