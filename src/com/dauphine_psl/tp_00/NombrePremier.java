package com.dauphine_psl.tp_00;

import java.util.Random;

public class NombrePremier {
	
	public static final Random RANDOM_SEED = new Random(42);
	
	private int[] entiers;
	private int nbEntiers = 0;
	
	public NombrePremier(int nbMaxEntiers) {
		entiers = new int[nbMaxEntiers];
	}
	
	public void add(int entier) {
		entiers[nbEntiers++] = entier;
	}
	
	public void initRandom(int n, int m) {
		if (n <= 0 || n > entiers.length) {
			throw new IllegalArgumentException ("Error : initRandom, n can't be equal or less than 0 or greater than nbMaxEntiers!");
		}
		
		for (int i = 0; i < n; ++i) {
			add(RANDOM_SEED.nextInt(m - 1) + 1);
		}
	}
	
	private boolean isPrime(int p) {
		int pSquare = (int) Math.sqrt(p);
		
		for (int i = 2; i <= pSquare; ++i) {
			if (p % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public void printPrimes() {
		for (int entier : entiers) {
			if (isPrime(entier)) {
				System.out.println(entier);
			}
		}
	}
	
	public static void main(String[] args) {
		NombrePremier nbPremier = new NombrePremier(100);
		
		nbPremier.initRandom(100, 100);
		nbPremier.printPrimes();
	}

}
