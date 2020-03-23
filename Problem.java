package com.company;

import java.util.*;

public class Problem {


    public Problem() {
    }

    public void doTheProblem() {

        //construim rezidentii si spitalele

        Resident R0 = new Resident("R0", 8);
        Resident R1 = new Resident("R1", 5);
        Resident R2 = new Resident("R2", 6);
        Resident R3 = new Resident("R3", 10);
        Resident R4 = new Resident("R4", 0);
        Hospital H0 = new Hospital("H0", 1);
        Hospital H1 = new Hospital("H1", 2);
        Hospital H2 = new Hospital("H2", 2);

        //pentru fiecare spital construim un arrayList cu rezidentii pe care ii prefera in ordinea lor
        ArrayList<Resident> resH0 = new ArrayList<Resident>();
        resH0.add(R3);
        resH0.add(R0);
        resH0.add(R1);
        resH0.add(R2);

        ArrayList<Resident> resH1 = new ArrayList<Resident>();
        resH1.add(R0);
        resH1.add(R2);
        resH1.add(R1);

        ArrayList<Resident> resH2 = new ArrayList<Resident>();
        resH2.add(R0);
        resH2.add(R1);
        resH2.add(R3);

        Matching match = new Matching();

        for (Resident i : resH0) { //ocupam astfel, pe rand (atata timp cat putem) locurile valabile din spitale cu rezidenti
            if (i.workFor(H0) > 0) { // daca am angajat rezidentul i, metoda ne returneaza 1, deci
                Element e = new Element(); // cream un nou element
                e.constructEl(i, H0);//        ce va contine rezidentul i si spitalul H0
                match.addToMatching(e); //adaugam elementul la match
            }
        }

        for (Resident i : resH1) { // ANALOG
            if (i.workFor(H1) > 0) {
                Element e = new Element();
                e.constructEl(i, H1);
                match.addToMatching(e);
            }
        }

        for (Resident i : resH2) { // ANALOG

            if (i.workFor(H2) > 0) {
                Element e = new Element();
                e.constructEl(i, H2);
                match.addToMatching(e);
            }
        }

        match.print(); // printam match ul rezultat


    }


}
