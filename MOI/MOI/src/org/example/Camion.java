package org.example;

public class Camion extends Vehicule {
    private double capaciteCharge;

    public Camion(String id, String marque, int anneeFabrication, double capaciteCharge) {
        super(id, marque, anneeFabrication);
        this.capaciteCharge = capaciteCharge;
    }
@Override
public void afficherDetails() {
    System.out.println("Camion - Marque: " + marque + ", Année: " + anneeFabrication + ", Capacité de charge: " + capaciteCharge);
}

@Override
public String toString() {
    return "Camion - ID: " + id + ", Marque: " + marque + ", Année: " + anneeFabrication + ", Capacité de charge: " + capaciteCharge;
}
}