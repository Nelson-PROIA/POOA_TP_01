package com.dauphine_psl.tp_00;

import java.util.Random;

/**
 * 
 * Classe NombresPremiers, représentant une collection d'entiers et permettant
 * de trouver et d'afficher les nombres premiers parmi eux.
 * 
 * L'instance de cette classe peut être initialisée avec un tableau d'entiers et
 * les nombres premiers peuvent être identifiés et affichés.
 * 
 * @see Random
 * 
 * @author Nelson PROIA (nelson.proia@dauphine.eu)
 * 
 */
public class NombresPremiers {

	/**
	 * Générateur de nombres aléatoires avec une graine fixe.
	 * 
	 * @see Random
	 */
	public static final Random RANDOM_SEED = new Random(42);

	/*
	 * Tableau des entiers.
	 */
	private int[] entiers;

	/*
	 * Nombre d'entiers actuellement dans le tableau.
	 */
	private int nbEntiers = 0;

	/**
	 * Constructeur de la classe NombresPremiers.
	 * 
	 * @param nbMaxEntiers le nombre maximum d'entiers que la collection peut
	 *                     contenir.
	 */
	public NombresPremiers(int nbMaxEntiers) {
		entiers = new int[nbMaxEntiers];
	}

	/**
	 * Ajoute un entier à la collection.
	 * 
	 * @param entier l'entier à ajouter.
	 */
	public void add(int entier) {
		entiers[nbEntiers++] = entier;
	}

	/**
	 * Initialise la collection avec des entiers aléatoires dans une plage
	 * spécifiée.
	 * 
	 * @param n le nombre d'entiers à ajouter.
	 * @param m la valeur maximale pour les entiers aléatoires.
	 */
	public void initRandom(int n, int m) {
		if (n <= 0 || n > entiers.length) {
			throw new IllegalArgumentException(
					"Erreur : initRandom(), n ne peut pas être plus petit ou égal à 0 ou plus grand que nbMaxEntiers!");
		}

		for (int i = 0; i < n; ++i) {
			add(RANDOM_SEED.nextInt(m - 1) + 1);
		}
	}

	/**
	 * Vérifie si un entier est premier.
	 * 
	 * @param p l'entier à vérifier.
	 * 
	 * @return true si l'entier est premier, sinon false.
	 */
	private boolean isPrime(int p) {
		int pSquare = (int) Math.sqrt(p);

		for (int i = 2; i <= pSquare; ++i) {
			if (p % i == 0) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Affiche les nombres premiers de la collection.
	 */
	public void printPrimes() {
		for (int entier : entiers) {
			if (isPrime(entier)) {
				System.out.println(entier);
			}
		}
	}

	/**
	 * Fonction principale (run).
	 * 
	 * @param args les arguments du programme.
	 * 
	 * @see String
	 */
	public static void main(String[] args) {
		NombresPremiers nbPremier = new NombresPremiers(100);

		nbPremier.initRandom(100, 100);
		nbPremier.printPrimes();
	}

}
