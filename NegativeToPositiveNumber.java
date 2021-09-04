package week1.day1.assignment;

public class NegativeToPositiveNumber {

	public static void main(String[] args) {
		int Num = -40;
		int PositiveNumber;
		if (Num < 0) {
			PositiveNumber = (Num * -1);
			System.out.println("The number " + Num + " is converted to " + PositiveNumber);
		} else {
			System.out.println("The given number: " + Num + " is already a positive number");
		}
	}
}

// Reference:
//Problem statement: Convert a negative number to positive number
//---------------------------------------------------------------
//Pseudocode:
//-----------
//1. Initialize an integer with a negative number
//   like, int number = -40;
//2. Check if the number is a negative number 
   //Hint : any number that is lesser than zero is a negative number
//3. If so, convert the number to a positive numer
//4. Print as below
//        "The number -40 is converted to 40"