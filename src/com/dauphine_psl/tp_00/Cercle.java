package com.dauphine_psl.tp_00;

public class Cercle {
	
	public static final double PI = 3.14;
	
	private Point centre;
	private int rayon;
	
	public Cercle(Point centre, int rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public void translate(int dx, int dy) {
		centre.translate(dx, dy);
	}
	
	public double surface() {
		return PI * Math.pow(rayon, 2);
	}
	
	public void afficheCercle() {
		System.out.println("Cercle(centre=(" + centre.getX() + ", " + centre.getY() + "), rayon=" + rayon + "), surface=" + this.surface());
	}
	
	public boolean contains(Point p) {
		// Test if point in a circle (x - center_x)² + (y - center_y)² < radius².
		return Math.pow(p.getX() - centre.getX(), 2) + Math.pow(p.getY() - centre.getY(), 2) < Math.pow(rayon, 2);
	}
	
	public static boolean contains(Point p, Cercle...cercles) {
		for (Cercle cercle : cercles) {
			if (cercle.contains(p)) {
				return true;
			}
		}
		
		return false;
	}

}
