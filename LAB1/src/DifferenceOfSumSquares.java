
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
