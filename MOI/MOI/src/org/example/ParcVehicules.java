package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class ParcVehicules {
    private HashMap<String, Vehicule> vehicules;

    public ParcVehicules() {
        vehicules = new HashMap<>();
    }

   public void ajouterVehicule(Vehicule vehicule) {
    if (vehicule == null) {
        System.out.println("Erreur : Le véhicule est null.");
        return;
    }
    if (vehicule.getId() == null || vehicule.getId().isEmpty()) {
        System.out.println("Erreur : L'ID du véhicule est invalide.");
        return;
    }
    vehicules.put(vehicule.getId(), vehicule);
    System.out.println("Véhicule ajouté avec succès : " + vehicule);
}
    public void supprimerVehicule(String id) {
        vehicules.remove(id);
    }

    public void modifierVehicule(String id, Vehicule vehiculeModifie) {
        if (vehicules.containsKey(id)) {
            vehicules.put(id, vehiculeModifie);
        } else {
            System.out.println("Véhicule avec l'identifiant " + id + " non trouvé.");
        }
    }

    public Vehicule rechercherParNom(String nom) {
        for (Vehicule v : vehicules.values()) {
            if (v.getMarque().equalsIgnoreCase(nom)) {
                return v;
            }
        }
        return null;
    }

    public void listerVehiculesParLettreInitiale(char lettre) {
        for (Vehicule v : vehicules.values()) {
            if (Character.toUpperCase(v.getMarque().charAt(0)) == Character.toUpperCase(lettre)) {
                v.afficherDetails();
            }
        }
    }

    public int nombreVehiculesEnStock() {
        return vehicules.size();
    }

    public void enregistrerDonneesDansFichier(String Fichier) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Fichier))) {
            for (Vehicule v : vehicules.values()) {
                writer.write(v.toString());
                writer.newLine();
            }
            System.out.println("Données enregistrées dans le fichier " + Fichier);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}