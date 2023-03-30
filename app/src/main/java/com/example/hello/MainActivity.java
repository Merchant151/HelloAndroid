package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import android.support.*;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<dayModel> dayModels = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mainList);

        setupDayModels();

        day_recycler_adapter adapter = new day_recycler_adapter(this,dayModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setupDayModels(){
        //to set up the model we create an array of all of the values for each of the list items
        String[] days = getResources().getStringArray(R.array.test_month);
        String[] dow = getResources().getStringArray(R.array.DOW);

        int count = 0;
        for (int i = 0; i < days.length; i ++){
            dayModels.add(new dayModel(days[i],dow[count]));
            count++;
            if (count == 7){
                count = 0;
            }
        }
    }
}
