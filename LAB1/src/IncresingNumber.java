
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
