package com.example.simplesoundz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.simplesoundz.R;

public class MainActivity extends AppCompatActivity {
    ImageView homepic;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        homepic = (ImageView) findViewById(R.id.homepic);
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openSoundDrawer();
            }
        });
    }

    public void openSoundDrawer(){
        Intent intent = new Intent(this, SoundDrawer.class);
        startActivity(intent);
    }
}
