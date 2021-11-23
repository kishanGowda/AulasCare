package com.example.aulascare;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    ArrayList<InstituteCard> instituteCards;
    ArrayList<Registration> registrations;

    public CardAdapter(ArrayList<InstituteCard> instituteCards)
    {
        this.instituteCards = instituteCards;
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
        InstituteCard currentVaccineCard = this.instituteCards.get(position);



        holder.vaccineName.setText(currentVaccineCard.getVaccineName());
        holder.vaccineInstitute.setText(currentVaccineCard.getInstituteName());
        holder.vaccineImage.setImageResource(currentVaccineCard.getImageResource());


    }

    @Override
    public int getItemCount() {
        return instituteCards.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        public ImageView vaccineImage;
        public TextView vaccineName;
        public TextView vaccineInstitute;


        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            vaccineImage = itemView.findViewById(R.id.vaccineImage);
            vaccineName = itemView.findViewById(R.id.vaccineName);
            vaccineInstitute = itemView.findViewById(R.id.instituteName);

        }
    }
}