/**
*Name-Nirbhai Kujur
*Descripyion-Lab1- Power of 2 Check
*Date-17/03/2021
*/
public class PowerOfTwo {
	public static boolean checkNumber(int number)
	{
        if(number<=0)
        {
        	return false;
        }
		
        while(number>1)
        {
        	if((number%2)!=0)
        		{
        		return false;
        		}
        		number=number/2;
        }
		return true;
	}

}
