package com.dauphine_psl.tp_00;

import java.util.Arrays;

/**
 * 
 * Classe LigneBrisee, représentant une ligne brisée composée de points.
 * 
 * @see Point
 * 
 * @author Nelson PROIA (nelson.proia@dauphine.eu)
 * 
 */
public class LigneBrisee {

	/**
	 * Tableau des points de la ligne brisée.
	 * 
	 * @see Point
	 */
	private Point[] points;

	/**
	 * Nombre de points actuellement dans la ligne brisée.
	 */
	private int nbPoints = 0;

	/**
	 * Constructeur de la classe LigneBrisee.
	 * 
	 * @param nbMaxPoints le nombre maximum de points que la ligne brisée peut
	 *                    contenir.
	 * 
	 * @see Point
	 */
	public LigneBrisee(int nbMaxPoints) {
		points = new Point[nbMaxPoints];
	}

	/**
	 * Ajoute un point à la ligne brisée.
	 * 
	 * @param p le point à ajouter.
	 * 
	 * @see Point
	 */
	public void add(Point p) {
		points[nbPoints++] = p;
	}

	/**
	 * Renvoie la capacité de la ligne brisée, c'est-à-dire le nombre maximum de
	 * points qu'elle peut contenir (moins le nomre de points déjà ajoutés) sans
	 * dépasser sa taille maximale.
	 * 
	 * @return la capacité de la ligne brisée.
	 */
	public int pointCapacity() {
		return points.length - nbPoints;
	}

	/**
	 * Renvoie le nombre de points actuellement présents dans la ligne brisée.
	 * 
	 * @return le nombre de points dans la ligne brisée.
	 */
	public int nbPoints() {
		return nbPoints;
	}

	/**
	 * Vérifie si la ligne brisée contient un point donné.
	 * 
	 * @param p3 le point à vérifier.
	 * 
	 * @return true si le point est contenu dans la ligne brisée, sinon false.
	 * 
	 * @see Point
	 */
	public boolean contains(Point p3) {
		if (nbPoints == 0) {
			return false;
		}

		Point p1 = points[0];

		if (nbPoints == 1) {
			return p1.isSameAs(p3);
		}

		for (Point p2 : Arrays.copyOfRange(points, 1, nbPoints)) {
			// Vérifie si la somme des distances de p1 à p3 et de p2 à p3 est égale à la
			// distance de p1 à p2.
			if (Point.distance(p1, p3) + Point.distance(p2, p3) == Point.distance(p1, p2)) {
				return true;
			}

			p1 = p2;
		}

		return false;
	}

}
