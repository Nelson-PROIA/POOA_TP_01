package com.dauphine_psl.tp_01;

/**
 * 
 * Classe TestPoint, permet de tester la classe Point.
 * 
 * @see Point
 * 
 * @author Nelson PROIA (nelson.proia@dauphine.eu)
 *
 */
public class TestPoint {

	/**
	 * Fonction principale (run).
	 * 
	 * @param args les arguments du programme.
	 * 
	 * @see String
	 */
	public static void main(String[] args) {
		// (2) Erreur à la compilation, on essaye d'accéder à des attributs privés hors
		// de la classe de déclaration (visibilité de private pour des attributs limitée
		// à la classe de déclaration). On pourrait utiliser des accesseurs/getters ou
		// utiliser le modifier `public` pour les attributs.

		// Point p = new Point();
		// System.out.println(p.x + " " + p.y);
	}

}
