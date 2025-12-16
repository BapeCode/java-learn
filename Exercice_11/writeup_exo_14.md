## **Concept 14 : L'Héritage (extends) 👨‍👦**
C'est le moment de structurer ta banque comme une vraie banque pro. Actuellement, tous tes comptes sont les mêmes. Mais en réalité, il existe :

1. Le Compte Courant : A le droit au découvert.

2. Le Compte Épargne : N'a pas le droit au découvert, mais gagne des intérêts.

Au lieu de faire deux classes totalement différentes (et de copier-coller tout le code ```name```, ```amount```, ```deposit```...), on va utiliser l'Héritage.

On va dire : "Un Compte Epargne EST UN Compte Bancaire, mais avec des trucs en plus".

Syntaxe :


```Java
public class CompteEpargne extends CompteBancaire {
    // Ici, on a automatiquement accès à tout ce qui est public/protected dans le parent !
    // On ajoute juste ce qui est spécifique.
}
```

---

# Exercice 14 : La Spécialisation 🧬
On ne touche pas à ```Banque.java``` ni ```Index.java``` pour l'instant. On va créer de nouvelles classes.

1. Nettoyage de ```CompteBancaire``` (Le Parent)

    - Supprime ```negative_amount``` (le découvert) et tout ce qui va avec (getters/setters).

    - Dans la méthode ```withdraw```, remets une logique simple : on ne peut pas retirer si ```amount < solde``` (pas de découvert par défaut dans le parent).

    - Passe les attributs ```name``` et ```amount``` de ```private``` à ```protected```.

        - Pourquoi ? ```private``` = seul le parent voit. ```protected``` = le parent et les enfants voient.

2. Création de ```CompteCourant.java``` (L'Enfant 1)

    - ```public class CompteCourant extends CompteBancaire```

    - Ajoute l'attribut ```private double decouvertAutorise;```.

    - Crée un constructeur qui prend (nom, solde, decouvert). Il doit appeler le constructeur du parent avec le mot clé ```super(nom, solde)```.

    - Override (Écrase) la méthode ```withdraw``` : réécris-la pour autoriser le découvert (utilise ta logique précédente ici).

3. Création de ```CompteEpargne.java``` (L'Enfant 2)

    - ```public class CompteEpargne extends CompteBancaire```

    - Ajoute un attribut ```private double tauxInteret;``` (ex: 0.05 pour 5%).

    - Crée le constructeur (avec ```super```).

    - Ajoute une méthode unique : ```applyInterest()```. Elle calcule les intérêts et les ajoute au solde.

C'est un gros morceau ! Commence par nettoyer le Parent, puis essaie de créer le ```CompteEpargne```. Dis-moi si le concept de ```extends``` et ```super``` est clair !