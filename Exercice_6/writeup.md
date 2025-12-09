## Exercice 7 : L'Architecte 📐
On va créer un petit outil pour calculer la surface de pièces.

Les consignes :

1. En dehors du ```main``` (mais dans la classe ```Main```), crée une méthode appelée ```calculerSurface```.

- Elle doit prendre 2 paramètres : ```double longueur``` et ```double largeur```.

- Elle ne doit pas être ```void```, elle doit renvoyer un ```double```.

- À l'intérieur, elle multiplie les deux et ```return``` le résultat.

2. Dans le ```main``` :

- Imagine que tu as un salon de 5m sur 4m. Appelle ta méthode avec ces chiffres.

- Stocke le résultat dans une variable ```double surfaceSalon```.

- Imagine une cuisine de 3.5m sur 2m. Appelle encore ta méthode (réutilisation !).

- Stocke le résultat dans ```double surfaceCuisine```.

- Affiche la surface totale de l'appartement (Salon + Cuisine).

**Pourquoi on fait ça ?** Si demain le calcul de la surface devient complexe (forme triangulaire etc.), tu n'auras qu'à changer le code à un seul endroit (la méthode) et tout ton programme se mettra à jour !

À toi ! Fais attention à bien placer la méthode (ne la mets pas À L'INTÉRIEUR du ```main```, mais juste en dessous ou au dessus).