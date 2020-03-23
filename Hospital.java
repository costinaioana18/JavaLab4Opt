package com.company;

public class Hospital implements Comparable<Hospital> {
    int availablePosts; // nr de posturi valabile
    String name;

    public Hospital(String nume, int n) { //constructorul
        this.availablePosts = n;
        this.name = nume;
    }

    public void print() { //o afisare mai clara a caractristicilor unui spital
        System.out.println("Hospital " + this.name + " has : " + this.availablePosts + " available posts");
    }

    public String getName() {
        return this.name;
    } //returneaza numele spitalului

    public int getAvailablePosts() {
        return this.availablePosts;
    } //returneaza numarul de posturi valabile

    public void decrease() { //metoda utilizata atunci cand "angajez" un rezident, micsorez numarul de posturi valabile
        this.availablePosts = this.availablePosts - 1;
    }


  /*  public boolean equals(Hospital h){
        return this.name.equals(h.name);

    }*/


    @Override // compar spitalele in functie de nume
    public int compareTo(Hospital o) {

        if (this.name.equals(o.name) == true)
            return 0;
        else
            return 1;

    }

    @Override
    public String toString() {
        return name;
    }
}
