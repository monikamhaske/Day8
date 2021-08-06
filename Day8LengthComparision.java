package Day8LineComparison;
import java.util.Scanner;

public class Day8LengthComparision {
	public static void main(String[] args) {

		System.out.println("Welcome To Line Computation Program");

		System.out.println("Enter the end points of line1 : ");
		double line1 = lengthCalculate();

		System.out.println("Enter the end points of line2 : ");
		double line2 = lengthCalculate();

		if (line1 == line2)
			System.out.println("Lines are equal In Length");
		else if (line1 > line2)
			System.out.println("Line1 is greater Than Line2");
		else
			System.out.println("line2 is greater Than Line1");

	}

	private static double lengthCalculate() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x1 : ");
		double x1 = s.nextDouble();

		System.out.println("Enter the value of y1");
		double y1 = s.nextDouble();

		System.out.println("Enter the value of x2");
		double x2 = s.nextDouble();

		System.out.println("Enter the value of y2");
		double y2 = s.nextDouble();

		double length = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		System.out.println("length of a line is : " + length);
		return length;

	}

}


