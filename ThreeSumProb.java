import java.util.*;

// Time Complexity is O(n^2) because every element is compared with the other element

public class ThreeSumProb {

    public static void main(String args[]){

    int[] nums = {0,0,0};
    List<List<Integer>> result = threeSum(nums);
    System.out.println(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++) System.out.print(nums[i]+",");
        for(int i=0;i<nums.length-2;i++){
         // if condition is to make sure there is no processing for the same element again. which results in duplicates in the final output.   
        if (i == 0 || (i > 0 && nums[i] != nums[i-1])) {
            int j = i+1;
            int k = nums.length-1;
            int sum = 0-nums[i];
            while(j<k){
                if(sum == nums[j]+nums[k]){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    // No processing of the same element 
                    while(j<k && nums[j]==nums[j+1]){j++;}
                    while(j<k && nums[k]==nums[k-1]){k--;}
                    // Increment and decrement pointers 
                    j++;
                    k--;
                }
                // if j+k less than the sum move the lower pointer
                else if (nums[j]+nums[k] < sum ) {j++;}
                // if the j+k is greater than the sum move the high pointer
                else {k--;}
            }
          } 
        }
        return result;
    }
}