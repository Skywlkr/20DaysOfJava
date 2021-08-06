import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		//saturday is the 6th day

		//130 seconds
		//1 minute 10 seconds
		
		// Step 1 Defines integers
		int seconds;
		int minutes;
		int remainder_seconds;

		//Step 2: Takes input
		System.out.println("Enter the Seconds");
		Scanner input= new Scanner(System.in);
		seconds = input.nextInt();

		//Step 3:
		minutes = seconds/60;
		remainder_seconds = seconds % 60;
		System.out.println(minutes  + " Minute(s) and  " +
				remainder_seconds + " Seconds ");
		
		float a = 10.0f;
		double d = 10.0;
		
		int f = 10;
		long b = 1000001;
		



	}

}
