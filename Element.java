package com.company;

public class Element { //elementul va fi o pereche (resident, spital)
    Resident resident;
    Hospital hospital;

    public Element() {
    }

    public void constructEl(Resident resi, Hospital hos) { // il "construim" adica ii adaugam un spital si un rezident
        this.resident = resi;
        this.hospital = hos;
    }

    public void printEl() { // printam perechea
        System.out.println(hospital.getName() + " -> " + resident.getName());
    }

}
