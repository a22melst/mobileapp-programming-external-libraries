package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    //Image urls
    String url1 = "https://images.pexels.com/photos/14792950/pexels-photo-14792950.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1";
    String url2 = "https://images.pexels.com/photos/15532795/pexels-photo-15532795.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1";
    ImageView img;
    Button btn;

    boolean switchImg = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.imageView);
        Picasso.get().load(url1).fit().into(img);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (switchImg) {
                    Picasso.get().load(url1).fit().into(img);
                    switchImg = false;
                }
                else {
                    Picasso.get().load(url2).fit().into(img);
                    switchImg = true;
                }

            }
        });

    }
}
