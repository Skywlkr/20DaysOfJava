import java.util.Random;
import java.util.Scanner;
/*
 * Program by Martez Andrews, II
 * 
 * A program to play lottery. It randomly generates a two-digit number, prompts the user to enter number

If input matches in the exact order, the award is $10,000.

If input matches all digits in the lottery number, the award is $3,000.

If input matches a digit in the lottery number, the award is $1,000.
 */
public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the lottery game!");
		System.out.println("Enter a 3 digit number");



		int lotonum;
		int x;



		Scanner myinput = new Scanner(System.in);

		lotonum = myinput.nextInt();

		Random random = new Random();

		x = random.nextInt(900) + 100;


		if (x ==lotonum) {
			System.out.println("Congrats you win $10,000");
		}
		else {
			System.out.println("The loto number was "+ x +" Sorry friend maybe next time.");
		}
	}

}
