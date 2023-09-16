package com.dauphine_psl.tp_01;

import java.util.Scanner;

/**
 * 
 * Classe PairImpair, qui étant donné un nombre entier saisie par l’utilisateur,
 * détermine si cet entier est positif ou négatif et pair ou impair.
 * 
 * @author Nelson PROIA (nelson.proia@dauphine.eu)
 *
 */
public class PairImpair {

	/**
	 * Fonction principale (run).
	 * 
	 * @param args les arguments du programme.
	 * 
	 * @see String
	 * @see Scanner
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entrez un entier : ");
		int entier = scanner.nextInt();

		System.out.println("L'entier est " + (entier % 2 == 0 ? "pair" : "impair") + ".");

		scanner.close();
	}

}
