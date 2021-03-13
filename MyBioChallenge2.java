/**
*Name-Nirbhai Kujur
*Description-Compilation & Running Test1
*Date-13/03/2021
*/

class MyBioChallenge2{
	public static int personID;
public static String personName;
public static String location;
public static String contactNumber;
public static String email;
public static void GetInput()
{
	
 personID=1001;
 personName="Nirbhai Kujur";
 location="Raipur";
 contactNumber="8827334254";
 email="kujur.nirbhaynk@gmai.com";
}
public static void ShowOutput()
{
	GetInput();
System.out.println("Person Id=: "+personID);
System.out.println("Name: "+personName);
System.out.println("Location: "+location);
System.out.println("Contact: "+contactNumber);
System.out.println("Email: "+email);
}
public static void main(String[]args)
{

	ShowOutput();
}
}