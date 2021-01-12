package com.example.proiectsma;

import androidx.appcompat.app.AppCompatActivity;

public class FridayModel extends AppCompatActivity {

    private String food;
    private int calories;

    public FridayModel(String food,int calories) {
        this.food=food;
        this.calories=calories;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}