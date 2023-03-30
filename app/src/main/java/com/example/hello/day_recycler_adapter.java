package com.example.hello;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class day_recycler_adapter extends RecyclerView.Adapter<day_recycler_adapter.MyViewHolder>{

    Context context;
    ArrayList<dayModel> dayModels;

    public day_recycler_adapter(Context context, ArrayList<dayModel> dayModels){
        this.context = context;
        this.dayModels = dayModels;

    }

    @NonNull
    @Override
    public day_recycler_adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate the layout give look to each of the rows
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.day_view_row,parent,false);
        return new day_recycler_adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull day_recycler_adapter.MyViewHolder holder, int position) {
        //assigning values to each row
        //based on the position of each value
        holder.number.setText(dayModels.get(position).getNumber());
        holder.day.setText(dayModels.get(position).getDay());
        holder.meal1.setText(dayModels.get(position).getMealOne());
        holder.meal2.setText(dayModels.get(position).getMealTwo());
        holder.meal3.setText(dayModels.get(position).getMealThree());

    }

    @Override
    public int getItemCount() {
        //shows how many items exist in total
        return dayModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        //works like an oncreate meothod grabs views from recycler view row layout file
        TextView number,day,meal1,meal2,meal3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            number = itemView.findViewById(R.id.dayNumber);
            day = itemView.findViewById(R.id.dayName);
            meal1 = itemView.findViewById(R.id.meal1);
            meal2 = itemView.findViewById(R.id.meal2);
            meal3 = itemView.findViewById(R.id.meal3);
        }
    }
}
