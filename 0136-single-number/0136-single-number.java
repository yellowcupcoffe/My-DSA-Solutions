class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            numbers.add(nums[i]);
        }

        HashSet<Integer> ans = new HashSet<>();    
        for(int i=0;i<nums.length;i++){
            if(numbers.contains(nums[i]) && ans.contains(nums[i]) ){ 
                ans.remove(nums[i]);
            } else{
             ans.add(nums[i]);     
            }
        }

        return ans.iterator().next();

    }
}