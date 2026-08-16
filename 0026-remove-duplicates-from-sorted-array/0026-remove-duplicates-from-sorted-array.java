class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 ) return 0;

        int f =1;
        int s=0;

        while(f < nums.length){
            if(nums[f] == nums[s]){
                f++;
            } else {
                s++;
                nums[s] = nums[f];
                f++;
            }
        }
        return s+1;
    }
}