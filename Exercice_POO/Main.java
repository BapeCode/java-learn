
public class Main {

    public static void main(String[] args) {
        Voiture audi = new Voiture("Audi", "Bleu", 80, 30000);
        Voiture porsche = new Voiture("Porsche", "Jaune", 300, 100000);
        Voiture epave = new Voiture("Epave", "Rouillé", 2, -500);

        audi.presentation();
        porsche.presentation();

        audi.speedUp();
        porsche.speedUp();
    }
}
