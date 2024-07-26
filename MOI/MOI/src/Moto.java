public class Moto extends Vehicule {
    private boolean hasTopCase;

    public Moto(String id, String marque, int anneeFabrication, boolean hasTopCase) {
        super(id, marque, anneeFabrication);
        this.hasTopCase = hasTopCase;
    }

    @Override
    public void afficherDetails() {
        String topCase = hasTopCase ? "avec Top Case" : "sans Top Case";
        System.out.println("Moto - Marque: " + marque + ", Année: " + anneeFabrication + ", " + topCase);
    }
}
