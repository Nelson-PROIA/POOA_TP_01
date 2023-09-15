package com.dauphine_psl.tp_00;

public class LigneBrisee {
	
	private Point[] points;
	private int nbPoints = 0;
	
	public LigneBrisee(int nbMaxPoints) {
		points = new Point[nbMaxPoints];
	}
	
	public void add(Point p) {
		points[nbPoints++] = p;
		nbPoints++;
	}
	
	public int pointCapacity() {
		return points.length - nbPoints;
	}
	
	public int nbPoints() {
		return nbPoints;
	}
	
	public boolean contains(Point p3) {
		// Pas sur de devoir vérifier cette condition si les objets sont instanciés à null par défaut.
		// Point p1 = null;
		//
		// if (nbPoints > 0) {
		//	   p1 = points[0];
		//}
		
		Point p1 = points[0];
		
		for (Point p2 : points) {
			if (Point.distance(p1, p3) + Point.distance(p2, p3) == Point.distance(p1, p2)) {
				return true;
			}
			
			p1 = p2;
		}
		
		return false;
	}

}
