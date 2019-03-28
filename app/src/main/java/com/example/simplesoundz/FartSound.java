package com.example.simplesoundz;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.simplesoundz.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class FartSound extends AppCompatActivity {
    private AdView mAdView;

    ImageView fart;

    SoundPool soundPool;
    int fartsound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fart_sound);

        fart = (ImageView) findViewById(R.id.fart);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        } else {
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);

        }
        MobileAds.initialize(this,
                "ca-app-pub-9067047377198111~8586514720");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        fartsound = soundPool.load(this, R.raw.fartsound, 1);

        fart.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View view) {
                soundPool.play(fartsound, 1 ,1 ,0,0,1);
            }

        });
    }
}

