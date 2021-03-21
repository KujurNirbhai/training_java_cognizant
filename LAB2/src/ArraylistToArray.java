import java.util.ArrayList;
import java.util.List;

/**
*Name-Nirbhai Kujur
*Descripyion-Lab2-Converting ArrayList to Array
*/
public class ArraylistToArray {

	public static void main(String[] args) {
	
		//Creating Arraylist
		List<String> productList =new ArrayList();
		//Adding String Values to productList of product
		productList.add("Television");
		productList.add("Refrigerator");
		productList.add("Washing Machine");
		productList.add("Air Conditioner");
		productList.add("Computer");
		
		System.out.println("ArrayList items-");
		for (String product : productList) {
			System.out.println(product);
			
		}
		
		System.out.println("Converting ArrayList to Array");
		String[] productItems = productList.toArray(new String[productList.size()]);
		
		for (int i=0; i<productList.size();i++) {
			System.out.println(productItems[i]);
			
		}
		
		
	}

}
