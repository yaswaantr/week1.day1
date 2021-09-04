package week1.day1.assignment;

public class Factorial {

	public static void main(String[] args) {

		int Input = 5;
		int fact = 1;

		for (int i = 1; i <= Input; i++) {

			fact = fact * i;
		}

		System.out.println("Factorial of " + Input + " is " + fact);
	}

}

//Reference: https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week1/day1/classroom/Factorial.java