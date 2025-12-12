# Exercice 11 (Hardcore) : Le Système Bancaire 🏦
Tu dois créer deux fichiers : ```CompteBancaire.java``` et ```Main.java```.

## 1. La Classe ```CompteBancaire```

### **Contraintes techniques :**

- Tous les attributs doivent être private.

- Aucun accès direct autorisé depuis le Main.

### **Attributs à créer :**

- Le nom du titulaire.

- Le solde (l'argent disponible).

- Le découvert autorisé (ex: 500€, ce qui veut dire que le solde peut descendre jusqu'à -500).

---

### **Fonctionnalités (Méthodes) :**

1. **Le Constructeur :** Il initialise le nom et le solde initial. Le découvert est fixé par défaut à 0 lors de la création (trop facile sinon).

2. **Getter/Setter :**

- On veut pouvoir lire le solde et le nom.

- On veut pouvoir modifier le découvert autorisé (Setter), mais seulement si le nouveau montant est positif (on ne peut pas avoir un découvert autorisé négatif). Si l'utilisateur tente de mettre une valeur invalide, affiche une erreur et ne change rien.

3. **Méthode ```deposer(montant)```** : Ajoute l'argent au solde. (Gère le cas où on essaie de déposer un montant négatif : c'est interdit).

4. **Méthode ```retirer(montant)``` :** C'est là que ça se corse.

- Tu ne peux retirer que si : ```(solde actuel - montant) >= -découvertAutorisé```.

- Si ça passe : retire l'argent et affiche "Retrait réussi, nouveau solde : X".

- Si ça ne passe pas : affiche "Fonds insuffisants !".

5. **Méthode ```afficherInfo()``` :** Affiche un résumé propre (Nom, Solde, Découvert).

---

### 2. ```Le Main``` (Scénario de Test)
Dans ton ```main```, tu dois écrire un scénario qui prouve que ta sécurité fonctionne :

1. Crée un compte pour "Mathieu" avec 1000€ de départ.

2. Tente de retirer 1200€ (Ça doit échouer, car découvert = 0 par défaut).

3. Utilise le Setter pour autoriser un découvert de 500€.

3. Retente le retrait de 1200€ (Ça doit réussir maintenant, le solde sera de -200).

4. Essaie de changer le découvert à -100€ (Ça doit afficher une erreur de sécurité via ton Setter).

5. Affiche les infos finales.

---

## **Bonus (Le vrai défi) :** Si tu t'ennuies, ajoute une méthode ```transferer(CompteBancaire destinataire, double montant)``` dans la classe ```CompteBancaire```.

- Elle prend un autre objet compte en paramètre.

- Elle retire l'argent du compte A (this) et l'ajoute au compte B (destinataire).

- Si le retrait échoue (pas assez de fonds), le virement doit être annulé complètement.