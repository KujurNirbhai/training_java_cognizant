import java.util.Scanner;

/**
*Name-Nirbhai Kujur
*Descripyion-Lab2-Searching For duplicate values in array
*/

public class DuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			int [] value= {12,1,4,7,21,25,41,7,36,25,52,9,0,22};
			int check=0;
		
			for(int i=0;i<=value.length;i++)
			{
				for(int j=i+1;j<value.length;j++)
			{
					if(value[j]==value[i])	
					System.out.println("The value is in array List at position:"+(i+1)+" & "+(j+1)+" - value :"+value[i]);
					check++;
				}
			}
			if(check==0) {
						System.out.println("No Duplicate valuess");
			}

		}

	}


