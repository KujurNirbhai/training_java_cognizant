
/**
*Name-Nirbhai Kujur
*Descripyion-Lab2-Sorting String Array
*/

import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize;
		System.out.println("Enter the size of array:");
		arraySize=sc.nextInt();
		
		String[] arrayList = new String[arraySize] ;
		String[] arrayListSorted = new String[arraySize]; 
		
		System.out.println("Enter The array String element of array");
		for(int i=0; i<=arraySize-1;i++)
		{
			arrayList[i]=sc.next();
		}
		//System.out.println("Array length :" +arrayList.length);
		
		arrayListSorted=sortStrings(arrayList);
		for (String arr : arrayListSorted) {
			System.out.println(arr);
		}
		System.out.println(Arrays.toString(arrayListSorted));

	}

	private static String[] sortStrings(String[] arrayList1) 
	{
		int arraySize=arrayList1.length;
		String[] sortedArray = new String[arraySize];
		sortedArray=arrayList1;
		String swap;
		for(int i=0; i<arraySize-1; i++)
			
			{
			for(int j=i+1;j<arraySize; j++)
			
			{
				if(sortedArray[i].compareTo(sortedArray[j])>0)
				{
					swap=sortedArray[i];
					sortedArray[i]=sortedArray[j];
					sortedArray[j]=swap;
				}
					
				}
			}

	
		  return sortedArray;
		/*Arrays.sort(arrayList1);
	*/
			}
	


	}


