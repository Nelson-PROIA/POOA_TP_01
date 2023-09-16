# POOA - TP 1 (Rappels Java)

## Sommaire

- Exercice 1 : Nombre Pair et Impair
- Exercice 2: Point
- Exercice 3 : Cercle
- Exercice 4 : Ligne brisée
- Exercice 5 : Recherche de nombres premiers

### Exercice 1 : Nombre Pair et Impair

Voir la classe `PairImpair.java`.

### Exercice 2: Point

1. On peut accéder à `p.x` et `p.y` (même ce sont des attributs privés) car on se trouve dans la même classe (`Point`).
2. Erreur à la compilation, on essaye d'accéder à des attributs privés hors de la classe de déclaration (visibilité de `private` pour des attributs limitée à la classe de déclaration). On pourrait utiliser des accesseurs/getters ou utiliser le modifier `public` pour les attributs.
3. Aucune raison de **TOUJOURS** déclarer les attributs avec le modifier `private`. On pourrait très bien vouloir utiliser des attributs `public` pour notre classe (attributs de configuration). Sinon le but de les déclarer en `private` est d'éviter qu'ils soient modifiés/accédés en dehors de la classe (non-mutable).
4. Un accesseur/getter offre la possibilité à des classes externes d'accéder à l'attribut. On pourrait l'utiliser ici pour palier le problème évoqué ci-dessus.
5. Erreur à la compilation, lors de la déclaration de n'importe quel constructeur (autre que le constructeur par défaut évidemment), le constructeur par défaut n'est plus utilisable/accessible.
6. Aucune erreur à la compilation, cependant les variables `x` et `y` "cachent" les attributs de la classe, on va devoir utiliser le mot clé `this` pour indiquer qu'on veut accéder aux attributs `x` et `y` de la classe.
7. On peut définir une variable de classe avec le mot clé `static` (variable qui ne sera pas liée à une instance mais directement à la classe), qu'on incrémenterait à chaque fois qu'on instancie un  `Point`.
8. Le compilateur sait quel constructeur appelé en fonction de la signature du constructeur (ça fonctionne pareil pour les fonctions/méthodes), à savoir le nom (forcément `Point`) et les arguments.
9. Voir classe `Point.java`.
10.  L'opérateur `==` permet de comparer deux valeurs (ici deux objets de la classe `Point`), appliqué à des objets l'opérateur permet de vérifier s'il s'agit du même objet, de la même référence. Par conséquent on a le premier affichage : Affiche `true` car `p2` est initialisée avec `p1`, soit une référence vers l'objet `p1` (`new Point(1, 2)`, retournant la référence vers une instance de la classe Point) et le deuxième affichage : Affiche `false` car `p3` est initialisée avec une nouvelle instance de la classe `Point` (même si les attributs ont les mêmes valeurs les deux objets sont différents).
11. Voir la classe `Point.java`.

### Exercice 3 : Cercle

Voir la classe `Cercle.java`.

### Exercice 4 : Ligne brisée

Voir la classe `LigneBrisee.java`.

### Exercice 5 : Recherche de nombres premiers

Voir la classe `NombresPremiers.java`.
