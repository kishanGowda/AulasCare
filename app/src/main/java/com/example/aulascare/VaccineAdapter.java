package com.example.aulascare;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;


public class VaccineAdapter extends RecyclerView.Adapter<VaccineAdapter.CardViewHolder> {
    ArrayList<Registration> registrations;


    public VaccineAdapter(ArrayList<Registration> registrations)
    {
        this.registrations=registrations;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        CardViewHolder cardViewHolder = new CardViewHolder(view);
        return cardViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Registration registerCard=this.registrations.get(position);


        holder.vaccineUpdate.setText(registerCard.getVaccineUpdate());
        holder.noOfVaccine.setText(registerCard.getNoOfVaccine());
        holder.dailyVaccine.setText(registerCard.getDailyVaccine());

    }

    @Override
    public int getItemCount() {
        return registrations.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {


        public TextView vaccineUpdate;
        public TextView noOfVaccine;
        public TextView dailyVaccine;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);


            vaccineUpdate=itemView.findViewById(R.id.vaccineUpdate);
            noOfVaccine=itemView.findViewById(R.id.noOfVaccine);
            dailyVaccine=itemView.findViewById(R.id.dailyVaccine);
        }
    }
}
