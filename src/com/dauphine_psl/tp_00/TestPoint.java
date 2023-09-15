package com.dauphine_psl.tp_00;

public class TestPoint {

	public static void main(String[] args) {
		// (5) Erreur à la compilation, lors de la déclaration de n'importe quel constructeur (autre que le constructeur par défaut) dans la classe, le constructeur par défaut n'est plus utilisable/accessible.
		// Point p = new Point();
		
		// (2) Erreur à la compilation, accès d'attributs privés depuis une autre classe. Utiliser des getters ou déclarer les attributs public.
		// System.out.println(p.x + " " + p.y);
	}
	
}
