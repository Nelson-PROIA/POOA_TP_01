package com.dauphine_psl.tp_00;

/**
 * 
 * Classe Cercle, représentant un cercle défini par un centre (Point) et un
 * rayon.
 * 
 * @see Point
 * 
 * @author Nelson PROIA (nelson.proia@dauphine.eu)
 * 
 */
public class Cercle {

	/**
	 * Valeur constante représentant la valeur de Pi.
	 */
	public static final double PI = 3.14;

	/**
	 * Centre du cercle (un Point).
	 * 
	 * @see Point
	 */
	private Point centre;

	/**
	 * Rayon du cercle.
	 */
	private int rayon;

	/**
	 * Constructeur de la classe Cercle.
	 * 
	 * @param centre le centre du cercle (un Point).
	 * @param rayon  le rayon du cercle.
	 * 
	 * @see Point
	 */
	public Cercle(Point centre, int rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}

	/**
	 * Translate le cercle en déplaçant son centre.
	 * 
	 * @param dx le déplacement en abscisse.
	 * @param dy le déplacement en ordonnée.
	 */
	public void translate(int dx, int dy) {
		centre.translate(dx, dy);
	}

	/**
	 * Calcule et renvoie la surface du cercle.
	 * 
	 * @return la surface du cercle.
	 */
	public double surface() {
		return PI * Math.pow(rayon, 2);
	}

	/**
	 * Vérifie si un point est contenu à l'intérieur du cercle.
	 * 
	 * @param p le point à tester.
	 * 
	 * @return true si le point est contenu dans le cercle, sinon false.
	 * 
	 * @see Point
	 */
	public boolean contains(Point p) {
		// Test si le point est à l'intérieur du cercle en utilisant la formule de
		// distance par rapport au centre.
		return Math.pow(p.getX() - centre.getX(), 2) + Math.pow(p.getY() - centre.getY(), 2) < Math.pow(rayon, 2);
	}

	/**
	 * Vérifie si un point est contenu à l'intérieur d'un ensemble de cercles.
	 * 
	 * @param p       le point à tester.
	 * @param cercles un tableau de cercles.
	 * 
	 * @return true si le point est contenu dans l'un des cercles, sinon false.
	 * 
	 * @see Point
	 * @see Cercle
	 */
	public static boolean contains(Point p, Cercle... cercles) {
		for (Cercle cercle : cercles) {
			if (cercle.contains(p)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Affiche les informations du cercle, y compris son centre, son rayon et sa
	 * surface.
	 */
	public void afficheCercle() {
		System.out.println("Cercle(centre=(" + centre.getX() + ", " + centre.getY() + "), rayon=" + rayon + ", surface="
				+ surface() + ")");
	}

}
