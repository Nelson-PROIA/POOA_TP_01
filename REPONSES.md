# Answers

1. Accès d'attributs privés dans la même classe.
2. Erreur à la compilation, accès d'attributs privés depuis une autre classe. Utiliser des getters ou déclarer les attributs `public`.
3. Faux. Dépendant du cas d'utilisation de/des l'attributs.*
4. Un accesseur (getter) offre la possibilité à des classes externe à la classe d'accéder à un attribut. On pourrait l'utiliser ici.
5. Erreur à la compilation, lors de la déclaration de n'importe quel constructeur (autre que le constructeur par défaut) dans la classe, le constructeur par défaut n'est plus utilisable/accessible.
6. On doit utiliser this car les variables locales (au constructeur) "cachent" les attributs de la classe (x et y), car ils portent les mêmes noms.
7. On peut définir une variable de classe static (non liée à une instance mais directement à la classe), qu'on incrémenterait à chaque appel d'un constructeur de la classe Point.
8. Le compilateur sait quel constructeur appelé en fonction des arguments (propriétés ?) qui sont passés en argument à celui-ci.
9. Voir classe Point.
10. L'opérateur == permet de comparer deux valeurs (ici deux objets de type Point), par défaut il fait appel à la méthode compareTo sur Object (on peut redéclarer/Override la méthode public int compareTo(Object object)), qui compare simplement la référence, par conséquent on a :
Affiche true car p2 est initialisée avec p1, soit une référence vers l'objet p1 (new Point(1, 2), retournant la référence vers une instance de la classe Point).
Affiche false car p3 est initialisée avec une nouvelle instance de la classe Point (même si les attributs ont les mêmes valeurs, on pourrait Override la méthode compareTo).
11. Voir classe Point.

