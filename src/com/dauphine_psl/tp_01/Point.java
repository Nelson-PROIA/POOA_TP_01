package com.dauphine_psl.tp_01;

/**
 * 
 * Classe Point, représentant des coordonnées cartésiennes (un point).
 * 
 * @author Nelson PROIA (nelson.proia@dauphine.eu)
 *
 */
public class Point {

	// (7) On peut définir une variable de classe avec le mot clé `static` (variable
	// qui ne sera pas liée à une instance mais directement à la classe), qu'on
	// incrémenterait à chaque fois qu'on instancie un `Point`.

	/**
	 * Variable statique/globale (liée et la classe et pas à une instance de la
	 * classe).
	 */
	private static int nbPoints = 0;

	/**
	 * Coordonnées x : l'abscisse et y : l'ordonnée.
	 */
	private int x, y;

	/**
	 * Construit un Point à partir d'un x : l'abscisse et d'un y : l'ordonnée (deux
	 * entiers).
	 * 
	 * @param x un abscisse.
	 * @param y une ordonnée.
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;

		nbPoints++;
	}

	// (8) Le compilateur sait quel constructeur appelé en fonction de la signature
	// du constructeur (ça fonctionne pareil pour les fonctions/méthodes), à savoir
	// le nom (forcément `Point`) et les arguments.

	/**
	 * Construit un Point à partie d'un autre (constructeur de copie).
	 * 
	 * @param p un Point.
	 */
	public Point(Point p) {
		this(p.x, p.y);
	}

	/**
	 * Getter de l'abscisse.
	 * 
	 * @return l'abscisse.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Getter de l'ordonnée.
	 * 
	 * @return l'ordonnée.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Renvoie le nombre de Point instanciés.
	 * 
	 * @return le nombre de points instanciés.
	 */
	public int nbPoints() {
		return nbPoints;
	}

	// (11) ...

	/**
	 * Permet comparer le Point à un autre Point, deux Point sont identiques s'ils
	 * ont les mêmes coordonnées.
	 * 
	 * @param p2 l'autre Point.
	 * 
	 * @return true s'ils ont les mêmes coordonnées, sinon false.
	 */
	public boolean isSameAs(Point p2) {
		return x == p2.x && y == p2.y;
	}

	/**
	 * Permet de translater un point à partir d'un déplacement en abscisse et d'un
	 * déplacement en ordonnée.
	 * 
	 * @param dx le déplacement en abscisse.
	 * @param dy le déplacement en ordonnée.
	 */
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}

	/**
	 * Renvoie la distance euclidienne entre deux Point.
	 * 
	 * @param p1 le premier Point.
	 * @param p2 le second Point.
	 * 
	 * @return la distance euclidienne entre les deux Point.
	 */
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}

	// (9) ...

	/**
	 * Affiche un Point sous la forme : (x, y).
	 */
	public void affichePoint() {
		System.out.println("(" + x + ", " + y + ")");
	}

	/**
	 * Fonction principale (run).
	 * 
	 * @param args les arguments du programme.
	 * 
	 * @see String
	 * @see Point
	 */
	public static void main(String[] args) {
		// (1) On peut accéder à `p.x` et `p.y` (même ce sont des attributs privés) car
		// on se trouve dans la même classe (`Point`).

		// Point p = new Point();
		// System.out.println(p.x + " " + p.y);

		// (3) Aucune raison de **TOUJOURS** déclarer les attributs avec le modifier
		// `private`. On pourrait très bien vouloir utiliser des attributs `public` pour
		// notre classe (attributs de configuration). Sinon le but de les déclarer en
		// `private` est d'éviter qu'ils soient modifiés/accédés en dehors de la classe
		// (non-mutable).
		// (4) Un accesseur/getter offre la possibilité à des classes externes d'accéder
		// à l'attribut. On pourrait l'utiliser ici pour palier le problème évoqué
		// ci-dessus.
		// (5) Erreur à la compilation, lors de la déclaration de n'importe quel
		// constructeur (autre que le constructeur par défaut) dans la classe, le
		// constructeur par défaut n'est plus utilisable/accessible.
		// (6) Aucune erreur à la compilation, cependant les variables `x` et `y`
		// "cachent" les attributs de la classe, on va devoir utiliser le mot clé `this`
		// pour indiquer qu'on veut accéder aux attributs `x` et `y` de la classe.

		Point p1 = new Point(1, 2);
		Point p2 = p1;
		Point p3 = new Point(1, 2);

		// (10) L'opérateur `==` permet de comparer deux valeurs (ici deux objets de la
		// classe `Point`), appliqué à des objets l'opérateur permet de vérifier s'il
		// s'agit du même objet, de la même référence. Par conséquent on a le premier
		// affichage : Affiche `true` car `p2` est initialisée avec `p1`, soit une
		// référence vers l'objet `p1` (`new Point(1, 2)`, retournant la référence vers
		// une instance de la classe Point) et le deuxième affichage : Affiche `false`
		// car `p3` est initialisée avec une nouvelle instance de la classe `Point`
		// (même si les attributs ont les mêmes valeurs les deux objets sont
		// différents).

		System.out.println(p1 == p2);
		System.out.println(p1 == p3);
	}

}
