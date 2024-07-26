public abstract class Vehicule {
    protected String id;
    protected String marque;
    protected int anneeFabrication;


    // Constructeur
    public Vehicule(String id, String marque, int anneeFabrication) {
        this.id = id;
        this.marque = marque;
        this.anneeFabrication = anneeFabrication;
    }

    // Méthode abstraite pour afficher les détails spécifiques du véhicule
    public abstract void afficherDetails();

    // Getters
    public String getId() {
        return id;
    }

    public String getMarque() {
        return marque;
    }

    public int getAnneeFabrication() {
        return anneeFabrication;
    }
}
