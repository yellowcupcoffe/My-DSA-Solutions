class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] minus = new int[(nums.length)/2];
        int m=0;
        int p=0;
        int[] plus = new int[(nums.length)/2];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0 ){
                minus[m]=nums[i];
                m++;
            } else {
                plus[p] = nums[i];
                p++;
            }
        }
        p=0;
        m=0;

        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i] = plus[p];
                p++; 
            } else{
                nums[i] = minus[m];
                m++;
            }
        }

        return nums;
    }
}