public class Voiture {
    private String brand;
    private String color;
    private int speed;
    private int price;

    public Voiture(String brand, String color, int speed, int price) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.price = price;

        if (this.price < 0) {
            this.price = 0;
            System.out.println("Prix négatif impossible");
        }
    }

    public void presentation() {
        System.out.println("Voiture " + this.brand + ", Couleur " + this.color + ", Vitesse " + this.speed + "km/h");
    }

    public void speedUp() {
        this.speed += 10;
        System.out.println("J'accélère ! Vitesse actuelle : " + this.speed + "km/h");
    }
}
