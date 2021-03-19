/**
*Name-Nirbhai Kujur
*Descripyion-Lab1 Fibonacci
*Date-14/032021
*/
import java.util.Scanner;

public class Fibonacci {
	private static int fibo(int a)
	{
		int fib1,fib2,fib=0;
		fib1=0;
		fib2=1;
		if(a==0||a==1)
		{
			return a;
		}
		else {
		for(int i=3; i<=a;i++)
		{
		fib=fib1+fib2;
		fib1=fib2;
		fib2=fib;
		}
		return fib2;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth no. of Fibonacci Series");
		int terms= sc.nextInt();
		System.out.println("The " +terms+"th term of the Fibonacci Series is " +fibo(terms));

	
	}

}
