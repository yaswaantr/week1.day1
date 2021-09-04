package week1.day1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {

		int Input = 13;
		boolean Flag = false;

		for (int i = 2; i < Input / 2; i++) {

			if (Input % i == 0) {
				Flag = true;
				break;
			}
		}
		if (!Flag)
			System.out.println(Input + " is a prime number");
		else
			System.out.println(Input + " is not a prime number");
	}

}

// Reference: https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week1/day1/assignments/PrimeNumber.java