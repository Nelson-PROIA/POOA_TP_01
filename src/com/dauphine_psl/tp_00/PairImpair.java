package com.dauphine_psl.tp_00;

import java.util.Scanner;

public class PairImpair {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		
		System.out.print("Entrez un entier : ");
		int entier = sc.nextInt();
		
		System.out.println("L'entier est " + (entier % 2 == 0 ? "pair" : "impair") + ".");
		
		sc.close();
	}

}
