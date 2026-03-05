# JEmpireV2.0

JEmpire est un jeu de gestion de stratégie au tour par tour développé en Java. Le joueur doit gérer ses ressources et ses habitants avec parcimonie afin de tenir le plus longtemps a des attaques.

## But du jeu

- Objectif principal : Survivre.
- Gestion : Gérer les ressources (nourriture, bois, pierre, etc.) à chaque tour.
- On peut contruitre ds bâtiments afin de recruter des soldats et des artisants
- Condition de défaite : Si votre population tombe à 0 habitant, la partie s'arrête immédiatement.

## Installation & Lancement

### Compilation

La commande suivante compile tous les fichiers sources présents dans le dossier src et place les fichiers compilés dans le dossier build :

```bash
javac -d build .\src\*
```

### Exécution

La commande suivante lance le jeu en utilisant les fichiers compilés présents dans le dossier build :

```bash
java -cp build/ Main
```
