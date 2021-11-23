package com.example.aulascare;



public class InstituteCard {

    private String instituteName;
    private int imageResource;
    private String vaccineName;

    public InstituteCard(String instituteName, int imageResource, String vaccineName) {
        this.instituteName = instituteName;
        this.imageResource = imageResource;
        this.vaccineName = vaccineName;

    }

    public String getInstituteName() {
        return instituteName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getVaccineName() {
        return vaccineName;
    }

}
