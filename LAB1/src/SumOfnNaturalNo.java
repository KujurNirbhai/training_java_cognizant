/**
*Name-Nirbhai Kujur
*Descripyion-Lab1- Sum of n natural no.
*Date-18/03/2021
*/
public class SumOfnNaturalNo {
	public static int calculateSum(int n) 
	{
		int sum=0;
		for(int i=3; i<=n; i++)
		{
			if((i%3)==0||(i%5)==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
