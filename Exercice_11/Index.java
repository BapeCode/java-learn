package Exercice_11;

public class Index {

    public static void main(String args[]) {
        CompteBancaire Mathieu = new CompteBancaire("Mathieu", 1000);
        CompteBancaire Bob = new CompteBancaire("Bob", 500);

        Mathieu.withdraw(1200);
        Mathieu.setNegativeAmount(-500);
        Mathieu.withdraw(1200);
        Mathieu.setNegativeAmount(-2000);
        Mathieu.transfer(Bob, 500);
        Mathieu.showInformation();
        Bob.showInformation();
    }
}
