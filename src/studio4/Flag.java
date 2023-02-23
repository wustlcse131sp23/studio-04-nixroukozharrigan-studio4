package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(184, 215, 233);
		StdDraw.setPenRadius(0.005);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		StdDraw.setPenColor(224, 76, 76);
		StdDraw.setPenRadius(0.05);
		StdDraw.arc(0.5, 0.3, 0.4, 0, 180);
		StdDraw.setPenColor(251, 163, 26);
		StdDraw.arc(0.5, 0.3, 0.32, 0, 180);
		StdDraw.setPenColor(251, 210, 0);
		StdDraw.arc(0.5, 0.3, 0.24, 0, 180);
		StdDraw.setPenColor(251, 210, 0);
		StdDraw.arc(0.5, 0.3, 0.24, 0, 180);
		StdDraw.setPenColor(77, 180, 80);
		StdDraw.arc(0.5, 0.3, 0.16, 0, 180);
		StdDraw.setPenColor(65, 105, 225);
		StdDraw.arc(0.5, 0.3, 0.08, 0, 180);
		StdDraw.setPenColor(138, 43, 250);
		StdDraw.arc(0.5, 0.3, 0.001, 0, 180);
	}
}