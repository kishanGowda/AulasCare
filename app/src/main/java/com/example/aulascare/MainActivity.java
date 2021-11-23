package com.example.aulascare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<InstituteCard> instituteCards = new ArrayList<>();
    ArrayList<Registration> registrations=new ArrayList<>();
    RecyclerView recyclerView1;
    RecyclerView recyclerView2;
    RecyclerView.Adapter cardAdapter;
    RecyclerView.Adapter vaccineAdapter;
    RecyclerView.LayoutManager cardLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createCard();
        registerVaccine();
        buildRecyclerView();
    }



    public void createCard() {
        instituteCards.add(new InstituteCard("Serum Institute of India", R.drawable.ser, "Covishield"));
        instituteCards.add(new InstituteCard("Bharat Biotech", R.drawable.cov, "Covaxin"));
        instituteCards.add(new InstituteCard("Gamaleya", R.drawable.sputnik, "Sputnik V"));
        instituteCards.add(new InstituteCard("Moderna", R.drawable.moderna, "mRNA-1273"));
        instituteCards.add(new InstituteCard("Zydus cadila", R.drawable.zyco, "ZyCoV-D"));
        instituteCards.add(new InstituteCard("Johnson & Johnson's janssen", R.drawable.jansen, "Ad26.COV.S"));
        instituteCards.add(new InstituteCard("Oxford/AstraZeneca", R.drawable.astra, "AZD1222"));

    }
    public void registerVaccine()
    {
        registrations.add(new Registration("CoWin Registrations","53.47Crores","+61.43Lakhs yesterday"));
        registrations.add(new Registration("Vaccinations Delivered","60.29Crores","+80.1Laksh yesterday"));
        registrations.add(new Registration("Fully Vaccinated ","13.57Crores","+21.91Lakhs yesterday"));
    }

    public void buildRecyclerView() {

        recyclerView1 = findViewById(R.id.recycleView_one);

        recyclerView2=findViewById(R.id.recycleView_two);

        recyclerView1.setHasFixedSize(true);

        recyclerView2.setHasFixedSize(true);

        cardLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(cardLayoutManager);

        recyclerView2.setLayoutManager(cardLayoutManager);

        cardAdapter = new CardAdapter(instituteCards);

        recyclerView1.setAdapter(cardAdapter);

        vaccineAdapter=new VaccineAdapter(registrations);

        recyclerView2.setAdapter(vaccineAdapter);
    }
}