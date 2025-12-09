
public class Main {
    
    public static void main(String[] args) {
        int age = 17;
        boolean hasTicket = true;

        if (age < 18) {
            System.out.println("Sortez, vous êtes trop jeune !");
        } else if (!hasTicket) {
            System.out.println("Allez au guichet acheter un billet");
        } else {
            System.out.println("Bienvenue, bonne soirée !");
        }
    }
}
