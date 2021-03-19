import java.util.Scanner;

public class TestDifferenceSquareSum {

	public static void main(String[] args) {
		DifferenceOfSumSquares difference;
		difference = new DifferenceOfSumSquares();
		int value=0,difference1=0;
		System.out.println("Enter the value of n ");
		Scanner sc = new Scanner(System.in);
		value = sc.nextInt();
		difference1=difference.calculateDifference(value);
		System.out.println("Difference of Squares of "+value+" and "+value+" natural no. = "+difference1);
		
	}

}
