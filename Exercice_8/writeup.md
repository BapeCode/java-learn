## Exercice 8 : L'Usine de Voitures 🚗
Pour cet exercice, tu vas devoir manipuler **2 fichiers différents**.

Partie 1 : Le Plan (La Classe)

Dans VS Code, crée un nouveau fichier nommé Voiture.java (dans le même dossier que Main.java).

À l'intérieur, écris ceci (c'est ton plan) :

Java

public class Voiture {
    // Les attributs (les caractéristiques de la voiture)
    String marque;
    String couleur;
    int vitesse;
}
C'est tout ! Pas de "public static void main" ici. Juste la définition.

Partie 2 : L'Usine (Le Main)

Retourne dans ton fichier Main.java.

Dans la méthode main, on va créer une voiture à partir du plan :

Java

public class Main {
    public static void main(String[] args) {
        
        // 1. Création de l'objet (On utilise le mot clé "new")
        Voiture maCaisse = new Voiture();
        
        // 2. On remplit les informations
        maCaisse.marque = "Peugeot";
        maCaisse.couleur = "Rouge";
        maCaisse.vitesse = 0;
        
        // 3. On affiche
        System.out.println("J'ai une " + maCaisse.marque + " de couleur " + maCaisse.couleur);
    }
}
Ton défi : Copie le code ci-dessus pour comprendre comment ça marche. Puis, ajoute une deuxième voiture dans le main (appelle-la voitureDeSport par exemple).

Marque : "Ferrari"

Couleur : "Jaune"

Vitesse : 300

Affiche les infos de la Ferrari juste en dessous de la Peugeot.

Dis-moi si tu arrives à faire cohabiter les deux fichiers ! (C'est souvent là que VS Code fait des siennes).