class Solution {
    public int[] runningSum(int[] nums) {
        
        int current_sum = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i] += current_sum;
            current_sum = nums[i];

        }

        return nums;
    }
}