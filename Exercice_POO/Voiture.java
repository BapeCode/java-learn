public class Voiture {
    String marque;
    String couleur;
    int vitesse;
    double price;

    public void presenter() {
        System.out.println("Je suis une " + marque + " de couleur " + couleur + " et je coûte " + price + "$");
    }

    public void accelerer() {
        vitesse = vitesse + 10;
        System.out.println("J'accélère ! Vitesse actuelle : " + vitesse + "km/h");
    }
}
