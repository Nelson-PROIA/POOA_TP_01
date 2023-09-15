package com.dauphine_psl.tp_00;

public class Point {

	private static int nbPoints = 0;
	
	private int x, y;
	
	public Point(int x, int y) {
		// (6) On doit utiliser this car les variables locales (au constructeur) "cachent" les attributs de la classe (x et y), car ils portent les mêmes noms.
		this.x = x;
		this.y = y;
		
		nbPoints++;
	}
	
	// (7) Le compilateur sait quel constructeur appelé en fonction des arguments (propriétés ?) qui sont passés en argument à celui-ci.
	public Point(Point p) {
		this(p.x, p.y);
		// this.x = p.x;
		// this.y = p.y;
		
		// nbPoints++;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int nbPoints() {
		return nbPoints;
	}
	
	public boolean isSameAs(Point p2) {
		return this.x == p2.x && this.y == p2.y;
	}
	
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}
	
	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
	
	public void affichePoint() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	public static void main(String[] args) {
		// (5) Erreur à la compilation, lors de la déclaration de n'importe quel constructeur (autre que le constructeur par défaut) dans la classe, le constructeur par défaut n'est plus utilisable/accessible.
		//Point p = new Point();
		
		// System.out.println(p.x + " " + p.y);
		Point p1 = new Point(1, 2);
		Point p2 = p1;
		Point p3 = new Point(1, 2);
		
		// (10) L'opérateur == permet de comparer deux valeurs (ici deux objets de type Point), par défaut il fait appel à la méthode compareTo sur Object (on peut redéclarer/Override la méthode public int compareTo(Object object)), qui compare simplement la référence, par conséquent on a :
		
		// Affiche true car p2 est initialisée avec p1, soit une référence vers l'objet p1 (new Point(1, 2), retournant la référence vers une instance de la classe Point).
		System.out.println(p1 == p2);
		// Affiche false car p3 est initialisée avec une nouvelle instance de la classe Point (même si les attributs ont les mêmes valeurs, on pourrait Override la méthode compareTo).
		System.out.println(p1 == p3);
	}
	
}
