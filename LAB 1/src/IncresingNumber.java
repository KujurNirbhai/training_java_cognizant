/**
*Name-Nirbhai Kujur
*Descripyion-Lab1- Check of Increasing no.
*Date-17/03/2021
*/
public class IncresingNumber {
	public static boolean checkNumber(int number)
	{
		
		int num;
		boolean flag=false;
		num = number%10;
		number=number/10;
		while(number>0)
		{
			if(num<=number%10)
			{
				flag=true;
				break;
			}
			num=number%10;
			number=number/10;
		}
	
	return flag;
	}
	

}
