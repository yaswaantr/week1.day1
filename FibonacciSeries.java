package week1.day1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {

		int Range = 8;
		int A = 0;
		int B = 1;
		int Sum;

		for (int i = 0; i < Range; i++) {
			System.out.println(A);
			Sum = A + B;
			A = B;
			B = Sum;

		}

	}

}

// Reference: https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week1/day1/assignments/FibonacciSeries.java