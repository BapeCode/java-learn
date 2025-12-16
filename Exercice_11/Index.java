package Exercice_11;

public class Index {
    public static void main(String args[]) {
        Banque bank = new Banque();

        bank.addCustomers(new CompteCourant("Mathieu", 500));
        bank.addCustomers(new CompteEpargne("Alice", 1000));

        CompteCourant mathieu = (CompteCourant) bank.getAccountByName("Mathieu");

        for (CompteBancaire compte : bank.getAccountBancaire()) {
            compte.interesetMensual();
        }

        mathieu.setNegativeAmount(-1000);
        mathieu.withdraw(1200);

        bank.showBilan();
    }
}
