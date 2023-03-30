package com.example.hello;

import java.util.ArrayList;

public class dayModel {
    String number;
    String Day;
    ArrayList<String> mealList;
    String mealOne;
    String MealTwo;
    String MealThree;

    public dayModel(String number, String day, ArrayList<String> mealList, String mealOne, String mealTwo, String mealThree) {
        this.number = number;
        Day = day;
        this.mealList = mealList;
        this.mealOne = mealOne;
        MealTwo = mealTwo;
        MealThree = mealThree;
    }

    public String getNumber() {
        return number;
    }

    public String getDay() {
        return Day;
    }

    public ArrayList<String> getMealList() {
        return mealList;
    }

    public String getMealOne() {
        return mealOne;
    }

    public String getMealTwo() {
        return MealTwo;
    }

    public String getMealThree() {
        return MealThree;
    }
}
