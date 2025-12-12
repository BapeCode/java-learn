package Exercice_11;

public class CompteBancaire {
    private String name;
    private double amount;
    private double negative_amount;

    public CompteBancaire(String name, double amount) {
        this.name = name;
        this.amount = amount;
        this.negative_amount = 0;
    }


    //  Getters

    public String getName() {
        return this.name;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getNegativeAmount() {
        return this.negative_amount;
    }

    //  Setters

    public void setNegativeAmount(double amount) {
        this.negative_amount = amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    //  Methods

    public void deposit(double amount) {
        this.setAmount(this.amount + amount);
        System.out.println("Dépôt réussi, nouveau solde : " + this.amount + "$");
    }

    public void withdraw(double amount) {
        if (this.amount - amount <= this.negative_amount) {
            System.out.println("Fond insuffisants !");
        } else {
            this.amount -= amount;
            System.out.println("Retrait réussi, nouveau solde : " + this.amount + "$");
        }
    }

    public void transfer(CompteBancaire account, double amount) {
        if (this.amount - amount <= this.negative_amount) {
            System.out.println("Fond insuffisants !");
        } else {
            this.amount -= amount;
            account.setAmount(account.getAmount() + amount);
            System.out.println("Virement réussi vers de '" + this.name + "' vers '" + account.getName() + "'");
        }
    }

    public void showInformation() {
        System.out.println("Nom de titulaire : " + this.name + "\nSolde du compte : $" + this.amount + "\nDécouvert : $" + this.negative_amount);
    }
}
