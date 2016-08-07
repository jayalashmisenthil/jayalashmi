import java.awt.Point;
import java.util.Arrays;

public class PointsAreSquare {

	/**
		given 4 points, whose x and y coordinates are both integers. 
		they are all different. write a function to check if they form a square. 
		i forgot to point out that the points can be given in any order	 
	*/
	public static void main(String[] args) {
		Point[] points = new Point[4];
		points[0] = new Point(3, 1);
		points[1] = new Point(-1, 1);
		points[2] = new Point(3, -2);
		points[3] = new Point(-1, -2);
		
		int minX = Integer.MAX_VALUE;
		int maxX = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE;
		int maxY = Integer.MIN_VALUE;
		// Find min/max x/y
		for (Point p : points ) {
			minX = Math.min(minX,  p.x);
			maxX = Math.max(maxX,  p.x);
			minY = Math.min(minY,  p.y);
			maxY = Math.max(maxY,  p.y);
		}
		// Array of booleans to mark if 
		// we find points in cc direction starting at UL
		boolean[] found = new boolean[4];
		for (Point p : points) {
			//UL:minX, maxY
			if (p.x == minX && p.y == maxY) found[0] = true;
			//UR:maxX, maxY
			if (p.x == maxX && p.y == maxY) found[1] = true;
			//LR:maxX, minY
			if (p.x == maxX && p.y == minY) found[2] = true;
			//LL:minX, minY
			if (p.x == minX && p.y == minY) found[3] = true;
		}
		for (boolean b : found) {
			if (!b) {
				System.out.println("Points don't represent a square.");
				return;
			}
		}
		System.out.println("Points " + Arrays.toString(points) + " are a square.");
	}
}