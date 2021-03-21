/**
*Name-Nirbhai Kujur
*Descripyion-Lab2-Longest Consecutive Sequence Length
*/
import java.util.Arrays;
import java.util.HashSet;
public class  LongestConsecutiveElemet {    
   public static void main(String[] args) {
        int nums[] = {49, 1, 3, 200, 2, 4, 70, 5};  
		System.out.println("Original array length: "+nums.length);
		System.out.print("Array elements are: ");
       for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]+" ");
        }
       System.out.println("\nSorted Array:");
		System.out.println("The new length of the array is: "+longest_sequence(nums));
			
    }
    
    public static int longest_sequence(int[] nums) {
    	Arrays.sort(nums);
    	int count=0;
    	System.out.println(Arrays.toString(nums));
    	for(int i=0; i<nums.length-1; i++)
    	{
    		System.out.println("Inside for "+i+" "+nums[i]);
    		if(nums[i]==(nums[i+1]-1))
    		{
    			
    			count++;
    		}
    	}
      /*final HashSet<Integer> h_set = new HashSet<Integer>();
        for (int i : nums) h_set.add(i);

        int longest_sequence_len = 0;
        for (int i : nums) {
            int length = 1;
            for (int j = i - 1; h_set.contains(j); --j) {
                h_set.remove(j);
                ++length;
            }
            for (int j = i + 1; h_set.contains(j); ++j) {
                h_set.remove(j);
                ++length;
            }
            longest_sequence_len = Math.max(longest_sequence_len, length);
        }
        return longest_sequence_len;
    
        */
   return count+1;
    }
}