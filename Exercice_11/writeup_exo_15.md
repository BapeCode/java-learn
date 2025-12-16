# Exercice 15 : Le Polymorphisme (Le Test Final) 🎭
Maintenant que tes classes sont prêtes (après correction des calculs), on va voir si ta ```Banque``` est capable de gérer tout ce petit monde.

C'est là que la magie de l'héritage opère : Ta liste ```ArrayList<CompteBancaire>``` peut contenir des Comptes Courants ET des Comptes Epargne ! Pourquoi ? Parce qu'ils SONT des comptes bancaires.

## **Tes consignes pour Index.java (Main) :**

1. Supprime ton ancien test.

2. Crée une Banque.

3. Tu vas devoir ruser, car ta méthode ```addCustomers``` de la Banque crée par défaut des CompteBancaire simples.

    - Option A (Facile) : Modifie ```addCustomers``` pour qu'elle prenne un 3ème argument (le type de compte) -> Trop compliqué pour l'instant.

    - Option B (Manuelle) : On va créer les objets à la main dans le Main et les ajouter.

### Dans le Main :

```Java
Banque maBanque = new Banque();

// 1. Crée un Compte Courant (Mathieu, 1000$, Découvert 500)
CompteCourant cpteMathieu = new CompteCourant("Mathieu", 1000, 500);

// 2. Crée un Compte Epargne (Alice, 2000$)
CompteEpargne cpteAlice = new CompteEpargne("Alice", 2000);

// 3. Ajoute-les à la banque (Il te faudra peut-être une méthode "ajouterCompteDirectement" dans Banque ?)
// OU BIEN : Modifie ta méthode addCustomers pour gérer ça.
```

Wait... On a un problème ! 🚧 Ta méthode ```addCustomers``` dans ```Banque``` fait ```new CompteBancaire(...)``` à l'intérieur. Elle ne sait pas créer des comptes épargne !

**Le Défi (Concept 15) :** Modifie ```Banque.java```. Ajoute une méthode : ```public void ajouterCompte(CompteBancaire compte)```. Elle prend un compte déjà créé (peu importe si c'est Epargne ou Courant) et l'ajoute à la liste.

### Scénario de test :

1. Crée Mathieu (Courant) et Alice (Epargne).

2. Ajoute-les à la banque via cette nouvelle méthode.

3. Fais un retrait de 1200$ pour Mathieu (Ça doit passer grâce au découvert !).

4. Applique les intérêts pour Alice.

5. Affiche le bilan de la banque.

Courage, c'est la dernière ligne droite de la POO !