
/**
*Name-Nirbhai Kujur
*Descripyion-Lab2-Return second smallest element in the array
*/

import java.util.Iterator;
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize,secondSmallest;
		System.out.println("Enter the size of array:");
		arraySize=sc.nextInt();
		
		int[] arrayList = new int[arraySize] ;
		
		
		System.out.println("Enter The array element of array");
		for(int i=0; i<=arraySize-1;i++)
		{
			arrayList[i]=sc.nextInt();
		}
		//System.out.println("Array length :" +arrayList.length);
		
		secondSmallest=getSecondSmallest(arrayList);
		System.out.println("Second Smallest :"+secondSmallest);

	}

	private static int getSecondSmallest(int[] arrayList1) 
	{
		int arraySize1,swap,secondSmallest1=0;
		arraySize1=arrayList1.length;
	   for(int i=0; i<arraySize1-1;i++)
	   {
		   for(int j=i;j<arraySize1-1; j++) 
		   {
			   
		   
		   if(arrayList1[i]>arrayList1[j])
		   {
			   swap=arrayList1[i];
			   arrayList1[i]=arrayList1[j];
			   arrayList1[j]=swap;
			   
		   }
	   } 
	   }
		secondSmallest1=arrayList1[1];
	return secondSmallest1;
	}

}
