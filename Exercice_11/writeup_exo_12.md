# **Rappel du Brief (L'Agence Bancaire)**
Tu as déjà ton fichier ```CompteBancaire.java``` (utilise la version corrigée/améliorée si tu veux, ou la tienne, l'important c'est que les méthodes ```deposit``` et ```showInformation``` existent).

Tu dois créer 2 nouveaux fichiers (ou modifier l'existant) :

## 1. ```Banque.java``` (Le Gestionnaire)
- **Import nécessaire :** Tout en haut, n'oublie pas ```import java.util.ArrayList;```.

- **Attribut :** Une liste privée qui ne contient QUE des ```CompteBancaire```.

- **Constructeur :** Il doit juste initialiser la liste (créer la boîte vide).

- **Méthode** ```ajouterClient(String nom, double solde)``` :

1. Elle crée un objet ```CompteBancaire``` (avec le ```new```).

2. Elle le range dans la liste (```.add```).

- Méthode ```afficherBilan()``` :

1. Elle parcourt toute la liste.

2. Elle demande à chaque compte de s'afficher.

---

## 2. ```Main.java``` (Le Patron)
- Crée une ```Banque```.

- Ajoute "Mathieu" (1000$), "Alice" (5000$) et "Bob" (20$).

- Appelle ```afficherBilan()``` pour voir si tout le monde est là.

---

Petit mémo syntaxe ```ArrayList``` pour t'aider (car c'est nouveau) :


```Java
// Déclaration
ArrayList<Type> maListe = new ArrayList<Type>();

// Ajouter
maListe.add(monObjet);

// Récupérer l'élément à l'index i
maListe.get(i);

// Connaître la taille
maListe.size();
```