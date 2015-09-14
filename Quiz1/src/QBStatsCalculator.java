
// Mayah McCutchen Quiz 1 

import java.util.Scanner;

public class QBStatsCalculator {
	private static Scanner sc;

	public static void main(String[] args) {
		// Variables
		sc = new Scanner(System.in);
		System.out.println("Passing attempts: ");
		double ATT = sc.nextDouble();
		System.out.println("Completions: ");
		double COMP = sc.nextDouble();
		System.out.println("Passing yards: ");
		double YDS = sc.nextDouble();
		System.out.println("Touchdown passes: ");
		double TD = sc.nextDouble();
		System.out.println("Interceptions: ");
		double INT = sc.nextDouble();

		// QB Formula
		double a = ((COMP / ATT) - .3) * 5;
		double b = ((YDS / ATT) - 3) * .25;
		double c = (TD / ATT) * 20;
		double d = 2.375 - ((INT / ATT) * 25);

		double PasserRating = ((a + b + c + d) / 6) * 100;

		System.out.println("This player's QB Rating is: " + PasserRating);

	}
}
