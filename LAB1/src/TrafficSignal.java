/**
*Name-Nirbhai Kujur
*Descripyion-Lab1- Traffic signal
*Date-14/032021
*/
import java.util.Scanner;

public class TrafficSignal {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int colorchoice;
		System.out.println("Enter The Colour Choice");
		System.out.println("1.Red");
		System.out.println("2.Green");
		System.out.println("3.Orange");
		
		colorchoice = sc.nextInt();
		switch (colorchoice)
		{
		case 1:
			{
				System.out.println("Stop");
			break;
			}
		case 2:{
			System.out.println("Go");
			break;
		}
		case 3:{
			System.out.println("Ready");
			break;
			}
			default:
				{System.out.println("Invalid Choice");
			break;
				}
		}
			
 /**    	if(colorchoice==1)
*		{
*		System.out.println("Stop");
*	
*	}
*		
*    	else if(colorchoice==2)
*		{
*			System.out.println("Go");
*			
*	}
*    	else if(colorchoice==3)
*	{
*			System.out.println("Ready");
*			
*	}
*     	else
*     	{
*     		System.out.println("Invalid Choice");
*     	}
*     		
*		
*/		
	}

}
