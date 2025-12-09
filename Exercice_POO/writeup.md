## Exercice 8 : L'Usine de Voitures 🚗
Pour cet exercice, tu vas devoir manipuler **2 fichiers différents**.

**Partie 1 : Le Plan (La Classe)**

1. Dans VS Code, crée un nouveau fichier nommé ```Voiture.java``` (dans le même dossier que ```Main.java```).

2. À l'intérieur, écris ceci (c'est ton plan) :

```Java
public class Voiture {
    // Les attributs (les caractéristiques de la voiture)
    String marque;
    String couleur;
    int vitesse;
}
// C'est tout ! Pas de "public static void main" ici. Juste la définition.
```

**Partie 2 : L'Usine (Le Main)**

1. Retourne dans ton fichier ```Main.java.```

2. Dans la méthode ```main```, on va créer une voiture à partir du plan :

```Java
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
```
Ton défi : Copie le code ci-dessus pour comprendre comment ça marche. Puis, ajoute une deuxième voiture dans le ```main``` (appelle-la ```voitureDeSport``` par exemple).

- Marque : "Ferrari"

- Couleur : "Jaune"

- Vitesse : 300

- Affiche les infos de la Ferrari juste en dessous de la Peugeot.

--- 

## Exercice 9 : Pilote automatique 🏎️
On va déplacer la logique. Au lieu de faire des ```System.out.println``` dans le ```Main```, c'est la voiture qui va se présenter elle-même.

**Étape 1 : Modifie** ```Voiture.java``` Ajoute 2 méthodes à l'intérieur de la classe (après les variables) :

1. Une méthode ```presenter()``` : Elle doit afficher "Je suis une [marque] de couleur [couleur] et je coûte [price]€".

2. Une méthode ```accelerer()``` :

- Elle ne prend pas de paramètre.

- Elle ajoute 10 à la vitesse de la voiture.

- Elle affiche "J'accélère ! Vitesse actuelle : [vitesse] km/h".

**Étape 2 : Nettoie** ```Main.java``` Dans ton main :

1. Garde la création des voitures et l'assignation des variables (marque, couleur, etc.).

2. Supprime tes anciens ```System.out.println```.

3. À la place, demande à tes voitures d'agir :

- Fais se présenter l'Audi.

- Fais accélérer la Porsche 3 fois de suite (en appelant 3 fois la méthode).