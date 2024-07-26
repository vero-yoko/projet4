package org.example;

import java.util.Scanner;

public class Main {
    private static ParcVehicules parc = new ParcVehicules();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quitter = false;
        while (!quitter) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine(); // Consommer le retour à la ligne

            switch (choix) {
                case 1:
                    ajouterVehicule();
                    break;
                case 2:
                    supprimerVehicule();
                    break;
                case 3:
                    modifierVehicule();
                    break;
                case 4:
                    rechercherVehicule();
                    break;
                case 5:
                    listerVehiculesParLettre();
                    break;
                case 6:
                    afficherNombreVehicules();
                    break;
                case 7:
                    sauvegarderDonnees();
                    break;
                case 8:
                    // Gérer les exceptions
                    break;
                case 9:
                    quitter = true;
                    System.out.println("Merci d'avoir utilisé notre système de gestion de parc de véhicules !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et 9.");
                    break;
            }
        }
    }

    private static void afficherMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Ajouter un véhicule");
        System.out.println("2. Supprimer un véhicule");
        System.out.println("3. Modifier un véhicule par son identifiant");
        System.out.println("4. Rechercher un véhicule par nom");
        System.out.println("5. Lister les véhicules par lettre initiale");
        System.out.println("6. Afficher le nombre de véhicules en stock");
        System.out.println("7. Sauvegarder les données dans un fichier");
        System.out.println("8. Gérer les exceptions");
        System.out.println("9. Quitter");
        System.out.print("Votre choix : ");
    }

    private static void ajouterVehicule() {
        System.out.print("Saisir l'identifiant du véhicule : ");
        String id = scanner.nextLine();
        System.out.print("Saisir la marque du véhicule : ");
        String marque = scanner.nextLine();
        System.out.print("Saisir l'année de fabrication du véhicule : ");
        int annee = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        // Ici, vous pourriez ajouter la logique pour choisir le type de véhicule à ajouter
        // Par exemple :
        // parc.ajouterVehicule(new Voiture(id, marque, annee, nombrePortes));

        System.out.println("Véhicule ajouté avec succès.");
    }

    private static void supprimerVehicule() {
        System.out.print("Saisir l'identifiant du véhicule à supprimer : ");
        String id = scanner.nextLine();

        parc.supprimerVehicule(id);
        System.out.println("Véhicule avec l'identifiant " + id + " supprimé avec succès.");
    }

    private static void modifierVehicule() {
        System.out.print("Saisir l'identifiant du véhicule à modifier : ");
        String id = scanner.nextLine();
        System.out.print("Saisir la nouvelle marque du véhicule : ");
        String nouvelleMarque = scanner.nextLine();
        System.out.print("Saisir la nouvelle année de fabrication du véhicule : ");
        int nouvelleAnnee = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne

        // Ici, vous pourriez ajouter la logique pour modifier le véhicule dans le parc
        // Par exemple :
        //parc.modifierVehicule(id, new Voiture(id, nouvelleMarque, nouvelleAnnee, nombrePortes));

        System.out.println("Véhicule avec l'identifiant " + id + " modifié avec succès.");
    }

    private static void rechercherVehicule() {
        System.out.print("Saisir le nom du véhicule à rechercher : ");
        String nom = scanner.nextLine();

        Vehicule v = parc.rechercherParNom(nom);
        if (v != null) {
            System.out.println("Véhicule trouvé : ");
            v.afficherDetails();
        } else {
            System.out.println("Aucun véhicule trouvé avec le nom " + nom);
        }
    }

    private static void listerVehiculesParLettre() {
        System.out.print("Saisir la lettre initiale pour lister les véhicules : ");
        char lettre = scanner.nextLine().charAt(0);

        parc.listerVehiculesParLettreInitiale(lettre);
    }

    private static void afficherNombreVehicules() {
        int nombreVehicules = parc.nombreVehiculesEnStock();
        System.out.println("Nombre de véhicules en stock : " + nombreVehicules);
    }
private static void sauvegarderDonnees() {
    System.out.print("Saisir le nom du fichier pour sauvegarder les données : ");
    String Fichier = scanner.nextLine();
    parc.enregistrerDonneesDansFichier("src/fichier.txt" + Fichier);
}
}