/**
*Name-Nirbhai Kujur
*Descripyion-Lab1-Cubesum
*Date-14/032021
*/
import java.util.Scanner;

public class CubeSum {

	public static int sumCube(int j)
	{
		int a,b;
		a=0;
		while(j>0)
		{
			b=j%10;
			a=a+(b*b*b);
			j=j/10;
			
		}
		return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("enter any number");
			x = sc.nextInt();
		
		y=sumCube(x);
		System.out.println("Sum of Cube of Digits is "+y);
		

	}

}
