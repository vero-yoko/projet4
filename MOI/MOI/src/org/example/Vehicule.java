package org.example;

public abstract class Vehicule {
    protected String id;
    protected String marque;
    protected int anneeFabrication;

    public Vehicule(String id, String marque, int anneeFabrication) {
        this.id = id;
        this.marque = marque;
        this.anneeFabrication = anneeFabrication;
    }

    public String getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public int getAnneeFabrication() {
        return anneeFabrication;
    }

    public abstract void afficherDetails();

    @Override
    public abstract String toString();
}