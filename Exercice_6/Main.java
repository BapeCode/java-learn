
public class Main {
    public static void main(String[] args) {
        double[] notes = {15, 10.5, 6, 20, 1};
        double somme = 0;

        for (int i =0; i < notes.length; i++) {
            somme = somme + notes[i];
        }
        double moyenne = somme / notes.length;
        System.out.println("La moyenne est de " + moyenne);
    }
}
