package com.company;

import java.util.ArrayList;

public class Matching {
    private ArrayList<Element> elements = new ArrayList<>(); // un array list de elemente de forma (resident, spital)

    public Matching() {
    }

    public void addToMatching(Element el) { // adaugam un element la match (o pereche spital, resident)
        elements.add(el);
    }

    public void print() { // printam match-ul final
        System.out.println("The matching solution is:");
        for (Element e : elements)
            e.printEl();
    }


}
