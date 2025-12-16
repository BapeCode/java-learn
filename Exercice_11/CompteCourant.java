package Exercice_11;

public class CompteCourant extends CompteBancaire {
    private double authorizationNegative;

    public CompteCourant(String name, double amount) {
        super(name, amount, "Courant");
        this.authorizationNegative = 0;
    }

    public void setNegativeAmount(int amount) {
        if (amount < 0) {
            this.authorizationNegative = -amount;
        } else {
            System.out.println("La valeur doit être négative !");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (this.amount - amount < -this.authorizationNegative) {
            System.out.println("Refusé ! Limite de découvert dépassée.");
        } else {
            this.amount -= amount;
            System.out.println("Retrait accepté (Solde : " + this.amount + "$)");
        }
    }

    @Override
    public void interesetMensual() {
        // Pas d'intérêts pour le compte courant
        System.out.println("Pas d'intérêts pour le compte courant.");
    }
}
