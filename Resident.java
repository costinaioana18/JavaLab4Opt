package com.company;

public class Resident implements Comparable<Resident> {
    String name;
    int isHired; // 0 daca nu e angajat, 1 daca este angajat undeva
    Hospital hospital; // spitalul la care este angajat, daca e cazul
    int grade; // o anumita nota (folosita la partea compulsory)


    public Resident(String nume, int nota) { //constructorul
        this.name = nume;
        isHired = 0;
        this.grade = nota;
    }

    public int isEmployed() {
        return this.isHired;
    } // returneaza 0 daca nu e angajat, 1, altfel

    public void print() { // o afisare mai clasa a caracteristicilor unui rezident
        if (isHired == 0) // numele, daca este angajat (si unde), nota sa
            System.out.println("Resident " + this.name + " is not hired and his grade is: " + this.grade);
        else {
            String nume = hospital.getName();
            System.out.println("Resident " + this.name + " is hired at " + nume + " and his grade is: " + this.grade);

        }
    }

    public int workFor(Hospital spital) { //incercarea de a-l angaja pe rezident la spital verificand daca este posibil

        if (this.isHired == 0) { //daca rezidentul nu e angajat in alta parte verificam valabilitatea posturilor

            if (spital.getAvailablePosts() > 0) { //daca spitalul are locuri il angajam
                this.hospital = spital;
                this.isHired = 1;
                this.hospital.decrease(); //actualizam atat caracteristicile spitalului, cat si a rezidentului angajat
                System.out.println(spital.getName() + " hired " + this.name); //afisam pentru a vedea mai clar cine a fost angajat si unde
                return 1;
            } else { //daca spitalul nu are locuri afisam:

                //System.out.println("The hospital doesn't have available posts anymore!");
            }
        } else { //daca rezidentul e angajat in alta parte afisam:

            // System.out.println("The resident is already hired at another hospital!");
        }
        return 0;
    }


    @Override//comparam rezidetii in functie de nota lor
    public int compareTo(Resident o) {
        if (this.grade < o.grade)
            return 1;
        else {
            if (this.grade > o.grade)
                return -1;
            else
                return 0;
        }
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
