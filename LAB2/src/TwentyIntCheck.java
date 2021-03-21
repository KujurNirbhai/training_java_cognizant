import java.util.Iterator;
import java.util.Scanner;

/**
*Name-Nirbhai Kujur
*Descripyion-Lab2-20 integer check for even ,odd ,positive ,negative and zero 
*/
public class TwentyIntCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] values = new int[20];
		System.out.println("Enter 20 integer values");
	
		for (int i=0; i<20;i++)
		{
			values[i]=sc.nextInt();
		}
		
		int even,odd,positive,negative,zeroes;
		 even=odd=negative=positive=zeroes=0;
		for(int i=0; i<20; i++)
		{
			if(values[i]>0)
			{
			if(values[i]%2==0)
			{
				even++;
			}
			if(values[i]%2!=0)
			{
				odd++;
			}
			if(values[i]>=0)
			{
				positive++;
			}
			
			}
			if(values[i]<0)
			{
				negative++;
			}
			if(values[i]==0)
			{
				zeroes++;
			}
		}

		System.out.println("Even no. entered: "+even);
		System.out.println("Odd no. entered: "+odd);
		System.out.println("Positive no. entered: "+positive);
		System.out.println("Negative no. entered: "+negative);
		System.out.println("Zeroes entered: "+zeroes);
	}

}
