import java.util.Scanner;

public class CheckPowerOfTwo {

	public static void main(String[] args) {
				PowerOfTwo powerOf2 = new PowerOfTwo();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Value to be Checked");
				int value = sc.nextInt();
				boolean check;
				check=powerOf2.checkNumber(value);
                
				if(check)
				{
					System.out.println("Given number is power of 2");
				}
					
				else
				{
					System.out.println("Given number is not power of 2");
				}
				
	}

}
