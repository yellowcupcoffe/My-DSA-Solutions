class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int res =0;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            } else{
                res = nums[i];
            }
        }

        return res;
    }
}