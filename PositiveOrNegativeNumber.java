package week1.day1.assignment;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {

		int Num = 35;
		if (Num > 0) {
			System.out.println(Num + " :the number is positive");
		} else if (Num < 0) {
			System.out.println(Num + " :the number is negative");
		} else {
			System.out.println(Num + " :the number is neither positive nor negative");
		}
	}
}
//Reference:
//Problem statement: Check if the number is positive or negative
//---------------------------------------------------------------
//Pseudocode:
//----------
 //1. Initialize a number, say, int number= 35;
 //2. If a number is positive, print "The number is positive"
 // If a number is negative, print "The number is negative"
 //If it nether negative nor positive, print as "The number is neither positive nor negative"