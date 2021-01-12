package com.example.proiectsma;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import static com.example.proiectsma.MainActivity.FridayModelList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    private TextView nrcalori;
    private EditText editfood, editcalories;
    private Button buttonadd,buttondelete;
    private RecyclerView FridayRv;
    private FridayAdapter FridayAdapter;
    private int nrcalorii=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment1, container, false);
        editfood = view.findViewById(R.id.editfood);
        editcalories = view.findViewById(R.id.editcalories);
        buttonadd = view.findViewById(R.id.buttonadd);
        buttondelete = view.findViewById(R.id.buttondelete);
        nrcalori = view.findViewById(R.id.calori);

        FridayRv=view.findViewById(R.id.rv_test_fridaylist);
        FridayAdapter = new FridayAdapter(FridayModelList);
        FridayRv.setLayoutManager(new LinearLayoutManager(getContext()));
        FridayRv.setAdapter(FridayAdapter);
        onclikers();
        return view;
    }


    public void adauga(String food,int calories){
        FridayModelList.add(new FridayModel(food,calories));
        nrcalorii=nrcalorii+calories;
        nrcalori.setText(Integer.toString(nrcalorii));
    }

    public void onclikers(){
        buttonadd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                adauga(editfood.getText().toString(),Integer.valueOf(editcalories.getText().toString()));
                editfood.getText().clear();
                editcalories.getText().clear();
            }
        });
        buttondelete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String foodtxt = editfood.getText().toString();
                String caloriestxt=editcalories.getText().toString();
                stergere(foodtxt);
                stergere(caloriestxt);
                editfood.getText().clear();
                editcalories.getText().clear();
                FridayAdapter.notifyDataSetChanged();
            }
        });
    }

    private void stergere(String s){
        for(int i=0;i<FridayModelList.size();i++){
            if(FridayModelList.get(i).getFood().equals(s)){
                FridayModelList.remove(i);
            }
        }
    }

}