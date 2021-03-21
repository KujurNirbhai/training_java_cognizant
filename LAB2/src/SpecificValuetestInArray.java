/**
*Name-Nirbhai Kujur
*Descripyion-Lab2-Specific value in array Test
*/
import java.util.Scanner;

public class SpecificValuetestInArray {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int [] value= {12,1,4,7,21,25,41,36,25,52,9,0,22};
		int specificValue,check=0;
		System.out.println("Enter the value you want to serch");
		specificValue=sc.nextInt();
		for(int i=0;i<value.length;i++)
		{
			if(specificValue==value[i])
			{
				System.out.println("The value is in array List at position:"+(i+1));
				check++;
			}
		}
		if(check==0) {
					System.out.println("Value not found in array lsit");
		}

	}

}
