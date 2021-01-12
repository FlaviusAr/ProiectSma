package com.example.proiectsma;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Fragment2 extends Fragment {

    private CardView c1,c2,c3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment2, container, false);
        c1 = view.findViewById(R.id.cv1);
        c2 = view.findViewById(R.id.cv2);
        c3 = view.findViewById(R.id.cv3);

        onclikers();

        return view;
    }



    public void onclikers(){
        c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Fragment2.this.getActivity(),Exercise1.class);
                startActivity(intent);
            }
        });
        c2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Fragment2.this.getActivity(),Exercise1.class);
                startActivity(intent);
            }
        });

        c3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Fragment2.this.getActivity(),Exercise1.class);
                startActivity(intent);
            }
        });
    }
}