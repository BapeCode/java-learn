
public class Main { // Attention: Majuscule ici et le fichier doit être Main.java

    public static void main(String[] args) {
        String firstName = "Mathieu";
        int age = 20;
        boolean isStudent = true;

        System.out.println("Départ : " + firstName + ", " + age + " ans. Étudiant : " + isStudent);

        // --- Le temps passe ---

        // 1. On modifie l'âge existant
        age = age + 1; // Ou plus court : age++;

        // 2. On change le statut
        isStudent = false;

        // 3. Calcul de l'année (C'est des maths simples !)
        int currentYear = 2025;
        int birthYear = currentYear - age;

        // 4. Affichage final
        System.out.println("Joyeux anniversaire ! J'ai maintenant " + age + " ans.");
        System.out.println("Né en : " + birthYear);
        System.out.println("Toujours étudiant ? " + isStudent);
    }
}