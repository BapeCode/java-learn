
public class Main {
    public static void main(String[] args) {
        Voiture myCar = new Voiture();
        myCar.marque = "Audi";
        myCar.couleur = "Bleu";
        myCar.vitesse = 80;
        myCar.price = 30000;

        Voiture myGoodCar = new Voiture();
        myGoodCar.marque = "Porsche";
        myGoodCar.couleur = "Rouge";
        myGoodCar.vitesse = 300;
        myGoodCar.price = 100000;

        myCar.presenter();
        myCar.accelerer();
        myGoodCar.presenter();
        myGoodCar.accelerer();
    }
}
