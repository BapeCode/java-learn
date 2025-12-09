
public class Main {
    public static void main(String[] args) {
        double surfaceSalon = calculateSurface(3.5, 2);
        double surfaceCuisine = calculateSurface(5, 4);

        System.out.println("La surface du salon est de : " + surfaceSalon + "m²");
        System.out.println("La surface de la cuisine est de : " + surfaceCuisine + "m²");

    }

    public static double calculateSurface(double lenght, double width) {
        return lenght * width;
    }
}
