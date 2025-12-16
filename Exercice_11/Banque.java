package Exercice_11;
import java.util.ArrayList;
;


public class Banque {
    private final ArrayList<CompteBancaire> accountList;

    public Banque() {
        this.accountList = new ArrayList<>();
    }

    public ArrayList<CompteBancaire> getAccountBancaire() {
        return this.accountList;
    }

    public CompteBancaire getAccountByName(String name) {
        for (CompteBancaire account : this.accountList) {
            if (account.getName().equals(name)) {
                return account;
            }
        }
        return null;
    }

    public void addCustomers(CompteBancaire newAccount) {
        this.accountList.add(newAccount);
        System.out.println("Compte ajouté pour " + newAccount.getName());
    }

    public boolean showBilan() {
        for (CompteBancaire account : this.accountList) {
            account.showInformation();
        }
        return true;
    }

}
