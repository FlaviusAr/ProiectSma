package com.example.proiectsma;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FridayViewHolder extends RecyclerView.ViewHolder {

    private TextView nameTv;
    private TextView firstnameTv;


    public FridayViewHolder(@NonNull View itemView) {
        super(itemView);
        initializeViews();
    }

    private void initializeViews(){
        nameTv = itemView.findViewById(R.id.iv_row_friday);
        firstnameTv = itemView.findViewById(R.id.tv_row_friday_firstname);
    }

    public void setValues(String name, String firstName){
        nameTv.setText(name);
        firstnameTv.setText(firstName);
    }

}