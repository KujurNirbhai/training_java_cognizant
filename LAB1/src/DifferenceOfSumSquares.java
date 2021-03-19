/**
*Name-Nirbhai Kujur
*Descripyion-Lab1- Difference of Square and Sum of n Number
*Date-18/03/2021
*/
public class DifferenceOfSumSquares {
	public static int calculateDifference(int n) 
	{
		int difference,sumN=0,squareSum=0;
		for(int i=1; i<=n; i++)
		{
			sumN+=i;
			
			}
		for(int i=1; i<=n; i++)
		{
			squareSum+=(i*i);
			
			}
		difference=squareSum-sumN;
		return difference;
	
	}

}
