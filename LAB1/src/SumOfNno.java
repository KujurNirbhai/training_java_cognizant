/**
*Name-Nirbhai Kujur
*Descripyion-Lab1- Sum Of n numbers
*Date-18/03/2021
*/import java.util.Scanner;

public class SumOfNno {

	public static void main(String[] args) {
		SumOfnNaturalNo sum1;
		sum1 = new SumOfnNaturalNo();
		Scanner sc = new Scanner(System.in);
		int value;
		System.out.println("Enter the value of n ");
		value=sc.nextInt();
		int sum;
		sum=sum1.calculateSum(value);
		System.out.println("Sum of first"+value+" natural no. divisible by 3 & 5 ="+sum);

	}

}
