package com.example.proiectsma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PicActivity2 extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    String name,url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic2);

        imageView = findViewById(R.id.iv_full);
        textView = findViewById(R.id.tv_name);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            name = extras.getString("n");
            url = extras.getString("u");

        }else {
            //   Toast.makeText(this, "Privact account", Toast.LENGTH_SHORT).show();
        }

        Picasso.get().load(url).into(imageView);
        textView.setText(name);
    }
}