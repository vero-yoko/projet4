package org.example;

public class Voiture extends Vehicule {
    private int nombrePortes;

    public Voiture(String id, String marque, int anneeFabrication, int nombrePortes) {
        super(id, marque, anneeFabrication);
        this.nombrePortes = nombrePortes;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Voiture - Marque: " + marque + ", Année: " + anneeFabrication + ", Portes: " + nombrePortes);
    }

    @Override
    public String toString() {
        return "Voiture - ID: " + id + ", Marque: " + marque + ", Année: " + anneeFabrication + ", Portes: " + nombrePortes;
    }
}