package com.example.aulascare;

import java.util.ArrayList;

public class Registration
{
    private String vaccineUpdate;
    private String noOfVaccine;
    private String dailyVaccine;
    public Registration(String vaccineUpdate, String noOfVaccine, String dailyVaccine) {
        this.vaccineUpdate = vaccineUpdate;
        this.noOfVaccine = noOfVaccine;
        this.dailyVaccine = dailyVaccine;
    }
    public String getVaccineUpdate() {
        return vaccineUpdate;
    }

    public String getNoOfVaccine() {
        return noOfVaccine;
    }

    public String getDailyVaccine() {
        return dailyVaccine;
    }
}
