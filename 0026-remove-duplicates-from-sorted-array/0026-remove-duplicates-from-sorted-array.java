class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int s=0; int f=1;

        while(f < nums.length){
            if(nums[s] == nums[f] ){
                f++;
            } else if(nums[s] != nums[f]){
                s++;
                nums[s] = nums[f];
                f++;
            }
        }

        return s+1;
    }
}