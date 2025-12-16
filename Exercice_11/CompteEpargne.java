package Exercice_11;

public class CompteEpargne extends CompteBancaire {
    private final double tauxInteret;


    public CompteEpargne(String name, double amount) {
        super(name, amount, "Epargne");
        this.tauxInteret = 0.05;
    }

    @Override
    public void interesetMensual() {
        double interets = this.amount * this.tauxInteret;
        this.amount += interets; // On ajoute direct au solde
        System.out.println("Intérêts appliqués : +" + interets + "$");
    }
}
