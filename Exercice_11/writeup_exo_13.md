# Concept 13 : Le mot-clé ```static``` (La Mémoire Commune) 🧠
Pour l'instant, chaque objet vit sa vie dans son coin. Si tu crées 10 objets ```CompteBancaire```, ils ont chacun leur ```solde```. C'est normal.

Mais imagine que tu veuilles savoir combien de comptes ont été créés au total dans ta banque, ou donner un numéro unique (ID) à chaque client.

Si tu mets une variable normale, elle repart à zéro pour chaque nouveau client. C'est là qu'intervient ```static```.
- Une variable non-statique appartient à l'objet (ex: le solde de Mathieu).
- Une variable statique appartient à la Classe (ex: le compteur de la Banque). Elle est partagée par tout le monde.

---
# Exercice 13 : Le Compteur Unique 🔢
On va modifier ton fichier ```CompteBancaire.java``` pour que chaque compte reçoive automatiquement un numéro unique (1, 2, 3...) à sa création.

**Les consignes :**

1. **Dans ```CompteBancaire.java``` :**

    - Ajoute une variable partagée (qui sert de compteur global) : ```private static int totalComptes = 0```;
    - Ajoute une variable individuelle (le numéro du client) : ```private int numeroCompte;``` (pas de static ici !)

    - **Modifie le Constructeur :**
        - Incrémente le compteur global : ```totalComptes++``` (ou ```totalComptes = totalComptes + 1```).
        - Assigne ce numéro au client : ```this.numeroCompte = totalComptes```;

    - **Modifie ```showInformation()``` :**
        - Affiche le numéro en premier : "Compte n°[numeroCompte] | Titulaire : ..."
    
    - **Ajoute une méthode statique (pour interroger la banque générale) :**

    ```Java
    public static int getNombreDeComptes() {
        return totalComptes;
    }
    ```
2. **Dans ```Index.java``` (Ton Main) :**

    - Après avoir créé tes clients et affiché le bilan via ```banque.showBilan()```.

    - Ajoute une ligne à la fin pour afficher : ```System.out.println("Nombre total de comptes ouverts : " + CompteBancaire.getNombreDeComptes());```

## ⚠️ Attention : Remarque bien que pour appeler la méthode statique, tu n'utilises pas la variable ```Mathieu``` ou ```Bob```, mais directement le nom de la classe ```CompteBancaire```. C'est ça la puissance du static !