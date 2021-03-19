import java.util.Scanner;

public class CheckIncresingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int value;
		IncresingNumber increase;
		increase = new IncresingNumber();
		boolean check;
		System.out.println("Enter any value :");
		value= sc.nextInt();
		check = increase.checkNumber(value);
		if(check)
		{
			System.out.println("Given Number is not in Increasing Order");
		}
		else
			System.out.println("Given Number is in Increasing order");
		

	}

}
