## Exercice 4 : Le Videur Bavard 🗣️
Reprends ton code. Cette fois, je veux que le videur donne la raison exacte du refus.

**Les consignes** : Modifie ton ```if / else``` pour gérer ces 3 cas dans cet ordre précis :

1. Si l'âge est strictement inférieur à 18 (```< 18```) :

- Affiche : "Sortez, vous êtes trop jeune !"

2. Sinon si (```else if```) la personne n'a PAS de ticket (vérifie ```hasTicket``` pour voir s'il est faux) :

- Affiche : "Allez au guichet acheter un billet."

3. Sinon (```else```) (ça veut dire qu'il est majeur ET qu'il a un ticket) :

- Affiche : "Bienvenue, bonne soirée !"

**Indice pour le "PAS de ticket" :**

- Tu peux tester ```hasTicket == false```

- Ou utiliser l'opérateur "NOT" qui s'écrit ```!``` (point d'exclamation). Exemple : ```!hasTicket``` veut dire "n'a pas de ticket".

À toi ! Essaie de changer les valeurs de tes variables ```age``` et ```hasTicket``` plusieurs fois avant de m'envoyer le code pour vérifier que tes 3 phrases s'affichent bien quand il faut.