package Exercice_11;

public abstract class CompteBancaire {
    protected String name;
    protected double amount;
    private static int totalAccount = 0;
    private final int accountNumber;
    private final String accountType;

    public CompteBancaire(String name, double amount, String accountType) {
        this.name = name;
        this.amount = amount;
        totalAccount += 1;
        this.accountNumber = totalAccount;
        this.accountType = accountType;
    }

    //  Getters

    public String getName() {
        return this.name;
    }

    public double getAmount() {
        return this.amount;
    }


    public int getAccountNumber() {
        return this.accountNumber;
    }

    public static int getTotalAccount() {
        return totalAccount;
    }

    //  Setters

    public void setName(String name) {
        this.name = name;
    }

    protected void setAmount(double amount) {
        this.amount = amount;
    }

    //  Methods

    public void deposit(double amount) {
        this.setAmount(this.amount + amount);
        System.out.println("Dépôt réussi, nouveau solde : " + this.amount + "$");
    }

    public void withdraw(double amount) {
        if (this.amount - amount < 0) {
            System.out.println("Fonds insuffisants !");
        } else {
            this.amount -= amount;
            System.out.println("Retrait réussi...");
        }
    }

    public void transfer(CompteBancaire account, double amount) {
        if (this.amount - amount >= 0) {
            System.out.println("Fond insuffisants !");
        } else {
            this.amount -= amount;
            account.setAmount(account.getAmount() + amount);
            System.out.println("Virement réussi vers de '" + this.name + "' vers '" + account.getName() + "'");
        }
    }

    public void showInformation() {
        System.out.println( "Compte n°[" + this.accountNumber + "] \nTitulaire : " + this.name + "\nSolde du compte : $" + this.amount + "\nType de compte : " + this.accountType);
    }

    public abstract void interesetMensual();
}