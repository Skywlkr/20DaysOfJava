import java.util.Scanner;

public class ComputeArea {

	public static void main(String[] args) {

		double radius, area;
		final double PI = 3.14159;
		//	double radius;
		//	double area;
		// Step 1
		// Take input from user
		//must be numbers 

		Scanner my_input = new Scanner(System.in);
		radius = my_input.nextDouble();
		//	System.out.println(radius);
		////	int x = input.nextInt;
		//	
		//	// Step 2
		//	// Calculate the area based on the input
		area = radius * radius * PI;
		//	// Step 3
		//	// Show the area in output
		System.out.println("the area of the circle is " + area + " and the radius is " + radius);

	}
}