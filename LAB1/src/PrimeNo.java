/**
*Name-Nirbhai Kujur
*Descripyion-Lab1-Prime No printing
*Date-14/03/2021
*/
import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of n");
		int n=sc.nextInt();
		displayPrime(n);

	}

	private static void displayPrime(int n) {
		// TODO Auto-generated method stub
		int remainder,count=0;
		if(n==1)
		{
		System.out.println("It is a natural no.");
		
		}
		for(int j=2;j<=n;j++)
		{
		for(int i=1;i<=n;++i)
		{
			
			remainder=j%i;
			if (remainder==0)
			{
				count++;
			}
		
		}
		if(count<=2)
			System.out.println(" "+j);
		count=0;
		}
		
	}

	

}
