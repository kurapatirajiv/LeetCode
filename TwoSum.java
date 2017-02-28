public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i =0; i<nums.length;i++){
            int diff = target-nums[i];
            if(hm.containsKey(diff)){
                return new int[] {hm.get(diff),i};
            }
            else{
                    hm.put(nums[i],i);               
            }
        }
            
    return new int[] {};    
    }
}