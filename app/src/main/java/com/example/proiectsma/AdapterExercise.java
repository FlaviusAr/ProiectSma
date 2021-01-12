/*package com.example.proiectsma;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import static com.templatevilla.fitness.Constants.ASSET_GIF_PATH;
import static com.templatevilla.fitness.Constants.EXTENSION;

/**
 * Created by Templatesvilla on 9/6/2019.


public class AdapterExercise extends RecyclerView.Adapter<com.templatevilla.fitness.Adapter.AdapterExercise.MyViewHolder> {

    private List<ModelExercise> list;
    private Context context;
    private clickInterface interfaceObj;

    public AdapterExercise(List<ModelExercise> list, Context context) {
        this.list = list;
        this.context = context;

    }

    public void setListener(clickInterface interfaceObj1) {
        interfaceObj = interfaceObj1;
    }

    @NonNull
    @Override
    public com.templatevilla.fitness.Adapter.AdapterExercise.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.level_detail_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final com.templatevilla.fitness.Adapter.AdapterExercise.MyViewHolder holder, int i) {
        Log.e("data id,name==", "" + list.get(i).id + " --  " + list.get(i).name);
        holder.tv_title.setText("" + list.get(i).name);
        Glide.with(context).asGif().load(ASSET_GIF_PATH + list.get(i).image + EXTENSION).into(holder.img_exercise);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public interface clickInterface {
        void onRecItemClick(int i, String refId);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tv_title;
        ImageView img_exercise;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.tv_title);
            img_exercise = itemView.findViewById(R.id.img_exercise);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (interfaceObj != null) {
                interfaceObj.onRecItemClick(getAdapterPosition(), list.get(getAdapterPosition()).id);
            }

        }
    }
}
*/