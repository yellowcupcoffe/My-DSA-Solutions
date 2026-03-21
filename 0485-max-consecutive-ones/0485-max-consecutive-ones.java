class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        if(nums.length == 1 && nums[0] !=1 ){
            return 0;
        }

    int zeroc=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i] != 0 ){
             zeroc++;
        }
    }

    if(zeroc == 0){
        return 0;
    }


        int max =0;
        int curr =0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == 1 && nums[i+1] == 1 ){
                 curr++;
                 max = Math.max( curr, max );
            } else {
                curr =0;
            }
        }


        return max+1;
    }
}