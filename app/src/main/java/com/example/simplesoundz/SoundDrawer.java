package com.example.simplesoundz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class SoundDrawer extends AppCompatActivity {

    ImageView farticon;
    ImageView dzicon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_drawer);

        farticon = (ImageView) (findViewById(R.id.icon2));
        farticon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openFart();
            }
        });
        dzicon = (ImageView) (findViewById(R.id.icon));
        dzicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDZicon();
            }
        });
    }

    public void openFart(){
        Intent intent = new Intent(this, FartSound.class);
        startActivity(intent);
    }

    public void openDZicon(){
        Intent intent2 = new Intent(this, DeezNuts.class);
        startActivity(intent2);
    }

    public void toastyMsg(String msg){
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
    public void toastMsg(View v){
        toastyMsg("Coming Soon!");
    }

}
